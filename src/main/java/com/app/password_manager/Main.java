package com.app.password_manager;


import com.app.password_manager.db.DBInitializer;
import com.app.password_manager.db.DBSelectAllData;
import com.app.password_manager.global.JFramesManager;
import com.app.password_manager.ui.MainWindow;
import com.app.password_manager.ui.item_menu.ItemMenu;
import com.app.password_manager.ui.main_menu.CreateAndSavePasswordMenu;

public class Main {

  public static void main(String[] args) {
    JFramesManager jFramesManager = new JFramesManager();
    jFramesManager.setMainMenu(new CreateAndSavePasswordMenu());
    jFramesManager.setItemMenu(new ItemMenu(jFramesManager));
    jFramesManager.setMainWindow(new MainWindow(jFramesManager));

    DBInitializer.initializeDatabase();

    DBSelectAllData.selectAll();

  }

}
