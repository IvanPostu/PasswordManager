package com.app.password_manager.ui.main_menu;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {

    private static final int width = 300;
    private static final int height = 200;

    public MainMenu (){
        super();
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.blue));
        setBounds(300, 0, width, height);
        setPreferredSize(new Dimension(width, height));

        setFocusable(true);
        requestFocus();
    }



}
