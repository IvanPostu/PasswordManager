package com.app.password_manager.utils;

import javax.swing.*;

public class JMultilineLabel extends JTextArea {
  public JMultilineLabel(String text){
    super(text);
    setEditable(false);
    setCursor(null);
    setOpaque(false);
    setFocusable(false);
    setFont(UIManager.getFont("Label.font"));
    setWrapStyleWord(true);
    setLineWrap(true);
  }
}
