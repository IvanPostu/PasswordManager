package com.app.password_manager.ui.main_menu;

import com.app.password_manager.ui.MainWindow;

import javax.swing.*;
import java.awt.*;

public abstract class MainMenu extends JPanel {

    public static final int width = 300;
    public static final int height = MainWindow.height;

    public MainMenu (){
        super();
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.blue));
        setBounds(300, 0, width, height);
        setPreferredSize(new Dimension(width, height));
        setLayout(null);

        setFocusable(true);
        requestFocus();
    }



}
