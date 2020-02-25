package com.app.password_manager.utils;

import javax.swing.*;
import java.awt.*;

public class Confirm {

    public static int YES = 0;
    public static int NO = 1;
    private int response;

    private Confirm(final String title, final String text){

        JPanel panel = new JPanel();
        panel.setSize(new Dimension(250, 100));
        panel.setLayout(null);
        JLabel label1 = new JLabel(text);
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
        label1.setBounds(20, 20, 200, 50);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label1);

        UIManager.put("OptionPane.minimumSize", new Dimension(250, 160));
        this.response  = JOptionPane.showConfirmDialog(null, panel, title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null);

    }

    public static int getResponseCode (final String title, final String text) {
        return new Confirm(title, text).response;
    }

}
