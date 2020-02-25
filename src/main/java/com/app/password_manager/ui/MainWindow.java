package com.app.password_manager.ui;

import com.app.password_manager.global.JFramesManager;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    public static final int width = 600;
    public static final int height = 400;

    public MainWindow(JFramesManager jFramesManager){
        super();

        add(jFramesManager.getItemMenu());
        add(jFramesManager.getMainMenu());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Password Manager");
        setSize(new Dimension(width, height));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);


    }

}