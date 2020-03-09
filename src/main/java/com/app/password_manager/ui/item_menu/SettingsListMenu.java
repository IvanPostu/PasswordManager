package com.app.password_manager.ui.item_menu;

import com.app.password_manager.global.JFramesManager;
import com.app.password_manager.ui.main_menu.CreateAndSavePasswordMenu;
import com.app.password_manager.ui.main_menu.MainMenu;
import com.app.password_manager.ui.main_menu.ServiceList;
import com.app.password_manager.utils.Confirm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;


public class SettingsListMenu extends JList<String> implements MouseListener {

  public static final int width = 280;
  public static final int height = 300;

  private JFramesManager jFramesManager;

  private enum CommandList {
    Create_and_save_password,
    Service_list
  };

  public SettingsListMenu(JButton itemSelectedOKBtn, JFramesManager jFramesManager) {

    this.jFramesManager = jFramesManager;

    String[] listElements = Arrays
        .stream(CommandList.values())
        .map(item -> item.toString().replace('_', ' ')
        )
        .toArray(String[]::new);

    setListData(listElements);
    setSelectedIndex(0);

    setBounds(10, 10, width, height);
    setBorder(BorderFactory.createLineBorder(Color.darkGray));
    setPreferredSize(new Dimension(width, height));
    setFocusable(true);
    requestFocus();
    addMouseListener(this);

    itemSelectedOKBtn.addActionListener(event -> {
      clickOnMenuElement();
    });

  }


  private void clickOnMenuElement() {
    int listIndex = this.getSelectedIndex(); //0...n
    CommandList getCommand = CommandList.values()[listIndex];

    switch (getCommand) {
      case Create_and_save_password:
        this.resetMainMenu(new CreateAndSavePasswordMenu());
        break;
      case Service_list:
        this.resetMainMenu(new ServiceList());
        break;
      default:
        break;
    }
  }

  private void resetMainMenu(final MainMenu newMainMenu){
    MainMenu oldMainMenu = this.jFramesManager.getMainMenu();
    this.jFramesManager.getMainWindow().remove(oldMainMenu);
    this.jFramesManager.setMainMenu(newMainMenu);
    this.jFramesManager.getMainWindow().add(newMainMenu);
    this.jFramesManager.getMainWindow().repaint();
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
