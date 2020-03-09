package com.app.password_manager.ui.main_menu;

import com.app.password_manager.utils.JMultilineLabel;

public class ServiceList extends MainMenu {

  public ServiceList() {
    super();

    JMultilineLabel passwordServiceTextTitle = new JMultilineLabel(
        "test");
    passwordServiceTextTitle.setBounds(5,5, width-20, 40);
    add(passwordServiceTextTitle);

  }

}
