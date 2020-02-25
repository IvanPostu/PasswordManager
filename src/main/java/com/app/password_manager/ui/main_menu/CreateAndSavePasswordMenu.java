package com.app.password_manager.ui.main_menu;

import com.app.password_manager.utils.JMultilineLabel;

import javax.swing.*;

public class CreateAndSavePasswordMenu extends MainMenu {

  private JTextField passwordServiceTextBox;
  private JPasswordField passwordTextBox;
  private JButton saveButton;

  public CreateAndSavePasswordMenu() {
    super();

    JMultilineLabel passwordServiceTextTitle = new JMultilineLabel(
        "Enter service for which you want to save password.");
    passwordServiceTextTitle.setBounds(5,5, width-20, 40);
//    passwordServiceTextTitle.setBorder(BorderFactory.createLineBorder(Color.blue));
    add(passwordServiceTextTitle);

    passwordServiceTextBox = new JTextField("");
    passwordServiceTextBox.setBounds(5, 45, width-20, 30);
    add(passwordServiceTextBox);

    JMultilineLabel passwordTitle = new JMultilineLabel(
        "Enter Password: ");
    passwordTitle.setBounds(5,95, width-20, 20);
//    passwordTitle.setBorder(BorderFactory.createLineBorder(Color.blue));
    add(passwordTitle);

    passwordTextBox = new JPasswordField("");
    passwordTextBox.setBounds(5, 115, width-20, 30);
    add(passwordTextBox);

    saveButton = new JButton("Save");
    saveButton.setBounds(15, 160, width-40, 50);
    saveButton.addActionListener(event -> saveButtonClick());
    add(saveButton);

  }

  private void saveButtonClick(){
    String service = passwordServiceTextBox.getText();
    String password = new String(passwordTextBox.getPassword());
    char a = 'a';
  }

}
