package com.app.password_manager.ui;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {

//    200, 0, 600, 600
    private static final int width = 600;
    private static final int height = 600;

    public MainMenu (){
        super();
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.darkGray));
        setBounds(200, 0, width, height);
        setPreferredSize(new Dimension(width, height));

        setFocusable(true);
        requestFocus();
    }

}
