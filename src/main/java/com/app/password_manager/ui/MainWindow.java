package com.app.password_manager.ui;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    private ItemMenu itemMenu;
    private MainMenu mainMenu;


    public MainWindow(){
        super();

        this.itemMenu = new ItemMenu();
        this.mainMenu = new MainMenu();

        add(this.itemMenu);
        add(this.mainMenu);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Password Manager");
        setSize(new Dimension(800, 600));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);


    }

}