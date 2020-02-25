package com.app.password_manager;

import com.app.password_manager.global.JFramesManager;
import com.app.password_manager.ui.MainWindow;
import com.app.password_manager.ui.item_menu.ItemMenu;
import com.app.password_manager.ui.main_menu.MainMenu;

public class Main {

    public static void main(String[] args) {
        JFramesManager jFramesManager = new JFramesManager();
        jFramesManager.setMainMenu(new MainMenu());
        jFramesManager.setItemMenu(new ItemMenu(jFramesManager));

        new MainWindow(jFramesManager);
    }

}
