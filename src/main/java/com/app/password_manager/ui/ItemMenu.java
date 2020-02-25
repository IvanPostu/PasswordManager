package com.app.password_manager.ui;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class ItemMenu extends JPanel {

    private Set<String> itemList;
    private JList jItemList;

    private static final int width = 300;
    private static final int height = 600;

    public ItemMenu() {
        super();
        setBackground(Color.LIGHT_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.darkGray));
        setBounds(0, 0, width, height);
        setPreferredSize(new Dimension(width, height));

        setFocusable(true);
        requestFocus();

        jItemList = new SettingsListMenu();
        add(jItemList);


    }

}
