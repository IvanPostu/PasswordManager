package com.app.password_manager.ui.item_menu;

import com.app.password_manager.utils.Confirm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class SettingsListMenu extends JList<String> implements MouseListener {

  public static final int width = 280;
  public static final int height = 300;
  private static final String[] LIST_ELEMENTS = {
      "Create and save password",
      "Generate and save password",
      "Generate password"
  };

  public SettingsListMenu(JButton itemSelectedOKBtn) {



    setListData(LIST_ELEMENTS);
    setSelectedIndex(0);

    setBounds(10, 10, width, height);
    setBorder(BorderFactory.createLineBorder(Color.darkGray));
    setPreferredSize(new Dimension(width, height));
    setFocusable(true);
    requestFocus();
    addMouseListener(this);

    itemSelectedOKBtn.addActionListener( event -> {
      clickOnMenuElement();
    });

  }

  private void clickOnMenuElement(){
    int listIndex = this.getSelectedIndex(); //0...n

    switch(listIndex){
      case 0:
        Confirm.getResponseCode("Message title", LIST_ELEMENTS[0]);//0-no, 1-yes
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

  @Override
  public void mouseClicked(MouseEvent mouseEvent) {
    if (mouseEvent.getClickCount() == 2) {
      clickOnMenuElement();
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
