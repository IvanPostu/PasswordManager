package com.app.password_manager.ui.main_menu;

import com.app.password_manager.db.DBSelectAllData;
import com.app.password_manager.db.DataModel;
import com.app.password_manager.logic.DESAlgorithm;
import com.app.password_manager.ui.message_box.MessageBoxInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class ServiceList extends MainMenu {



  private List<DataModel> allDataModels;

  public ServiceList() {
    super();

    allDataModels = DBSelectAllData.selectAll();


    String[] items = allDataModels
        .stream()
        .map(item -> item.getServiceName())
        .toArray(String[]::new);

    JList<String> services = new JList<>(items);
    services.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
          itemClicked(services.getSelectedIndex());
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
    });

    JScrollPane scrollbar = new JScrollPane(services);
    services.setAutoscrolls(true);
    scrollbar.setBounds(5, 5, width - 20, height - 50);
    add(scrollbar, BorderLayout.CENTER);

  }

  private void itemClicked(int itemIndex) {
    String out = "";
    DataModel model = this.allDataModels.get(itemIndex);
    out += String.format("Service: %s\n\n", model.getServiceName());
    out += String.format("Password: %s\n", DESAlgorithm.decrypt(
        model.getEncryptedPassword(), model.getEncryptionKey(), model.getDecryptedPasswordLength()
    ));

    new MessageBoxInfo("Message", out);
  }

}
