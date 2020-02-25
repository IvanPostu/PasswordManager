package com.app.password_manager.ui.message_box;

import com.app.password_manager.utils.JMultilineLabel;

import javax.swing.*;
import java.awt.*;

public class PasswordGeneratorMessageBox {

  public static int CLOSE = -1;
  public static int YES = 0;
  public static int NO = 1;

  private int response;

  private PasswordGeneratorMessageBox(final String password){

    JPanel panel = new JPanel();
    panel.setSize(new Dimension(250, 300));
    panel.setLayout(null);

    JLabel label1 = new JLabel("Generated password:");
    label1.setVerticalAlignment(SwingConstants.BOTTOM);
    label1.setBounds(20, 20, 200, 20);
//    label1.setBorder(BorderFactory.createLineBorder(Color.blue));
    label1.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(label1);

    JLabel label2 = new JLabel(password);
    label2.setVerticalAlignment(SwingConstants.BOTTOM);
    label2.setBounds(20, 50, 200, 20);
    label2.setHorizontalAlignment(SwingConstants.CENTER);
    label2.setFont(new Font("Default", Font.BOLD, 18));
//    label2.setBorder(BorderFactory.createLineBorder(Color.blue));
    panel.add(label2);


    JMultilineLabel jMultilineLabel = new JMultilineLabel("If you want the password to be saved in the field click \"yes\", if you want to exit without saving the changes click \"no\"");
    jMultilineLabel.setBounds(20, 160, 200, 75);
    panel.add(jMultilineLabel);

    UIManager.put("OptionPane.minimumSize", new Dimension(250, 300));
    this.response  = JOptionPane.showConfirmDialog(null, panel, "Password Generator",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.PLAIN_MESSAGE, null);

  }

  public static int getResponseCode (final String password) {
    return new PasswordGeneratorMessageBox(password).response;
  }


}
