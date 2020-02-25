package com.app.password_manager.logic;

import com.sun.org.glassfish.gmbal.Description;

@Description("Basic password generator interface.")
public interface IPasswordGenerator {

  enum Complexity {
    EASY,
    MEDIUM,
    HARD,
    VERY_HARD
  }

  String generatePassword(Complexity complexity);

  String generatePassword();

}
