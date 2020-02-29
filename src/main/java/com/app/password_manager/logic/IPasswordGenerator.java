package com.app.password_manager.logic;


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
