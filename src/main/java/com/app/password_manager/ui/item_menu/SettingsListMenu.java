package com.app.password_manager.ui.item_menu;

import com.app.password_manager.ui.main_menu.MainMenuForCreatePassword;
import com.app.password_manager.utils.Confirm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class SettingsListMenu extends JList<String> implements MouseListener {

  private static final int width = 280;
  private static final int height = 300;
  private static final String[] LIST_ELEMENTS = {
      "Create and save password",
      "Generate and save password",
      "Generate password"
  };

  public SettingsListMenu() {



    setListData(LIST_ELEMENTS);

    setBounds(10, 10, width, height);
    setBorder(BorderFactory.createLineBorder(Color.darkGray));
    setPreferredSize(new Dimension(width, height));
    setFocusable(true);
    requestFocus();
    addMouseListener(this);

  }

  @Override
  public void mouseClicked(MouseEvent mouseEvent) {
    if (mouseEvent.getClickCount() == 2) {
      int listIndex = this.getSelectedIndex(); //0...n

      switch(listIndex){
        case 0:
//          Confirm.getResponseCode("Message title", LIST_ELEMENTS[0]);//0-no, 1-yes
          MainMenuForCreatePassword.getResponseCode();
          break;
        case 1:
          Confirm.getResponseCode("Message title", LIST_ELEMENTS[1]);//0-no, 1-yes
          break;
        case 2:
          Confirm.getResponseCode("Message title", LIST_ELEMENTS[2]);//0-no, 1-yes
          break;
        default:
          break;
      }
    }
  }

  @Override
  public void mousePressed(MouseEvent mouseEvent) {
  }

  @Override
  public void mouseReleased(MouseEvent mouseEvent) {

  }

  @Override
  public void mouseEntered(MouseEvent mouseEvent) {

  }

  @Override
  public void mouseExited(MouseEvent mouseEvent) {

  }
}
