package com.app.password_manager.ui.main_menu;

import com.app.password_manager.db.DBInsertData;
import com.app.password_manager.db.DataModel;
import com.app.password_manager.logic.DESAlgorithm;
import com.app.password_manager.logic.IPasswordGenerator;
import com.app.password_manager.logic.Key8ByteGenerator;
import com.app.password_manager.logic.PasswordGeneratorFactory;
import com.app.password_manager.ui.message_box.MessageBoxInfo;
import com.app.password_manager.ui.message_box.PasswordGeneratorMessageBox;
import com.app.password_manager.utils.JMultilineLabel;

import javax.swing.*;
import java.awt.*;

public class CreateAndSavePasswordMenu extends MainMenu {

  private JTextField passwordServiceTextBox;
  private JPasswordField passwordTextBox;
  private JButton saveButton;
  private JButton generatePasswordButton;

  public CreateAndSavePasswordMenu() {
    super();

    JMultilineLabel passwordServiceTextTitle = new JMultilineLabel(
        "Enter service for which you want to save password.");
    passwordServiceTextTitle.setBounds(5,5, width-20, 40);
    add(passwordServiceTextTitle);

    passwordServiceTextBox = new JTextField("");
    passwordServiceTextBox.setBounds(5, 45, width-20, 30);
    add(passwordServiceTextBox);

    JMultilineLabel passwordTitle = new JMultilineLabel(
        "Enter Password: ");
    passwordTitle.setBounds(5,95, width-20, 20);
    add(passwordTitle);

    passwordTextBox = new JPasswordField("");
    passwordTextBox.setBounds(5, 115, width-20, 30);
    add(passwordTextBox);

    saveButton = new JButton("Save");
    saveButton.setBounds(15, 160, width-40, 50);
    saveButton.setBorder(BorderFactory.createLineBorder(Color.blue));
    saveButton.addActionListener(event -> saveButtonClick());
    add(saveButton);

    generatePasswordButton = new JButton("Generate password");
    generatePasswordButton.setBounds(15, 220, width-40, 50);
    generatePasswordButton.addActionListener(event -> generatePasswordButtonClick());
    generatePasswordButton.setBorder(BorderFactory.createLineBorder(Color.blue));
    add(generatePasswordButton);
  }

  private void saveButtonClick(){
    final String serviceName = passwordServiceTextBox.getText();
    final String rawPassword = new String(passwordTextBox.getPassword());
    final String key8Byte = Key8ByteGenerator.generate();
    final String encryptedPassword = DESAlgorithm.encrypt(rawPassword, key8Byte);
    final int rawPasswordLength = DESAlgorithm.calculateInitialMessageLength(rawPassword);

    DataModel model = new DataModel();
    model.setDecryptedPasswordLength(rawPasswordLength);
    model.setEncryptedPassword(encryptedPassword);
    model.setEncryptionKey(key8Byte);
    model.setServiceName(serviceName);

    model = DBInsertData.insertDataInDatabase(model);

    if(model.getId()!=null){
      this.passwordServiceTextBox.setText("");
      this.passwordTextBox.setText("");

      new MessageBoxInfo("Changes saved", "Your data was saved successfully!!!");
    }

  }

  private void generatePasswordButtonClick(){

    String generatedPassword = PasswordGeneratorFactory
        .createInstance()
        .generatePassword(IPasswordGenerator.Complexity.HARD);

    int code  = PasswordGeneratorMessageBox.getResponseCode(generatedPassword);

    if(code == PasswordGeneratorMessageBox.YES){
      passwordTextBox.setText(generatedPassword);
    }else if(code == PasswordGeneratorMessageBox.NO){
      //do nothing
    }


  }

}
