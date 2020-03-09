package com.app.password_manager.ui.message_box;

import javax.swing.*;
import java.awt.*;

public class MessageBoxInfo {

  public MessageBoxInfo(final String title, final String text){

    JPanel panel = new JPanel();
    panel.setSize(new Dimension(250, 100));
    panel.setLayout(null);
    JLabel label1 = new JLabel(text);
    label1.setVerticalAlignment(SwingConstants.BOTTOM);
    label1.setBounds(20, 20, 200, 50);
    label1.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(label1);

    UIManager.put("OptionPane.minimumSize", new Dimension(250, 160));
    JOptionPane.showConfirmDialog(null, panel, title,
        JOptionPane.CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE, null);

  }

}
