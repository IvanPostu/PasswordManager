package com.app.password_manager.ui;

import com.app.password_manager.global.JFramesManager;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {




    public MainWindow(JFramesManager jFramesManager){
        super();

        add(jFramesManager.getItemMenu());
        add(jFramesManager.getMainMenu());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Password Manager");
        setSize(new Dimension(800, 600));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);


    }

}