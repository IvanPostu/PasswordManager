package com.app.password_manager.ui.message_box;

import com.app.password_manager.utils.JMultilineLabel;

import javax.swing.*;
import java.awt.*;

public class MessageBoxInfo {

  public MessageBoxInfo(final String title, final String text){

    final int X = 250;
    final int Y = 120;

    JPanel panel = new JPanel();
    panel.setSize(new Dimension(X, Y));
    panel.setLayout(null);
    JMultilineLabel jMultilineLabel = new JMultilineLabel(text);
    jMultilineLabel.setBounds((int)(.1*X), (int)(.05*Y), (int)(.8*X), (int)(.9*Y));
    panel.add(jMultilineLabel);

    UIManager.put("OptionPane.minimumSize", new Dimension(250, 160));
    JOptionPane.showConfirmDialog(null, panel, title,
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE, null);

  }

}
