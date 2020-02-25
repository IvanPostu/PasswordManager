package com.app.password_manager.global;

import com.app.password_manager.ui.item_menu.ItemMenu;
import com.app.password_manager.ui.item_menu.SettingsListMenu;
import com.app.password_manager.ui.main_menu.MainMenu;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JFramesManager {

  private MainMenu mainMenu;
  private ItemMenu itemMenu;
  private SettingsListMenu settingsListMenu;


}
