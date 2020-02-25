package com.app.password_manager.ui.item_menu;

import com.app.password_manager.global.JFramesManager;
import com.app.password_manager.ui.MainWindow;

import javax.swing.*;
import java.awt.*;

public class ItemMenu extends JPanel {


    private static final int width = 300;
    private static final int height = MainWindow.height;
    private JButton itemSelectedOKBtn;

    public ItemMenu(JFramesManager jFramesManager) {
        super();
        setBackground(Color.LIGHT_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.darkGray));
        setBounds(0, 0, width, height);
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
        setLayout(null);

        itemSelectedOKBtn = new JButton("Ok");
        itemSelectedOKBtn.setFocusable(true);
        itemSelectedOKBtn.requestFocus();
        itemSelectedOKBtn.setBounds(10, SettingsListMenu.height+20, 55, 30);
        add(itemSelectedOKBtn);

        jFramesManager.setSettingsListMenu(new SettingsListMenu(itemSelectedOKBtn));
        add(jFramesManager.getSettingsListMenu());


    }

}
