package com.app.password_manager.ui.main_menu;

import com.app.password_manager.global.JFramesManager;
import com.app.password_manager.utils.Confirm;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

public class MainMenuForCreatePassword {

  public static int YES = 0;
  public static int NO = 1;
  private int response;

  private MainMenuForCreatePassword(){

    JPanel panel = new JPanel();
    panel.setSize(new Dimension(250, 100));
    panel.setLayout(null);
    JLabel label1 = new JLabel("Set service: ");
    label1.setVerticalAlignment(SwingConstants.BOTTOM);
    label1.setBounds(20, 5, 200, 30);
    label1.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(label1);

    JTextField textField = new JTextField("", 20);
    textField.setBounds(20, 40, 200, 30);
    textField.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(textField);

    JLabel label2 = new JLabel("Set password: ");
    label2.setVerticalAlignment(SwingConstants.TOP);
    label2.setHorizontalAlignment(SwingConstants.CENTER);
    label2.setBounds(20, 80, 200, 20);
    panel.add(label2);

    JPasswordField passwordField = new JPasswordField("", 20);
    passwordField.setBounds(20, 105, 200, 30);
    passwordField.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(passwordField);

    JLabel label3 = new JLabel("IF you want to save the options, press SAVE ");
    label3.setVerticalAlignment(SwingConstants.TOP);
    label3.setHorizontalAlignment(SwingConstants.CENTER);
    label3.setBounds(20, 190, 200, 20);
    panel.add(label3);

    JButton saveBtn = new JButton("Save");
    saveBtn.setVerticalAlignment(SwingConstants.TOP);
    saveBtn.setHorizontalAlignment(SwingConstants.CENTER);
    saveBtn.setBounds(20, 215, 200, 25);
    panel.add(saveBtn);

    saveBtn.addActionListener(a->{

      String service = textField.getText();
      String pass = passwordField.getText();

      char az= 'a';

    });

    UIManager.put("OptionPane.minimumSize", new Dimension(250, 300));
    this.response  = JOptionPane.showConfirmDialog(null, panel, "Enter password ",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE, null);

  }

  public static int getResponseCode () {
    return new MainMenuForCreatePassword().response;
  }

}
