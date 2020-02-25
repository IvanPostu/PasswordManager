package com.app.password_manager.ui.item_menu;

import com.app.password_manager.global.JFramesManager;

import javax.swing.*;
import java.awt.*;

public class ItemMenu extends JPanel {


    private static final int width = 300;
    private static final int height = 600;

    public ItemMenu(JFramesManager jFramesManager) {
        super();
        setBackground(Color.LIGHT_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.darkGray));
        setBounds(0, 0, width, height);
        setPreferredSize(new Dimension(width, height));

        setFocusable(true);
        requestFocus();

        jFramesManager.setSettingsListMenu(new SettingsListMenu());
        add(jFramesManager.getSettingsListMenu());


    }

}
