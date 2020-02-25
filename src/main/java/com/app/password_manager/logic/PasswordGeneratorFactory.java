package com.app.password_manager.logic;

public class PasswordGeneratorFactory {

  public static IPasswordGenerator createInstance(){
    return new PasswordGeneratorSimpleImpl();
  }

}
