package com.app.password_manager.logic;

import com.app.password_manager.utils.RandomInRange;

import java.util.Random;

public class Key8ByteGenerator {

  public static String generate(){

    StringBuilder builder = new StringBuilder();

    for(char c = 'a', c1='A'; c!='z'; c++, c1++){
      builder.append(c);
      builder.append(c1);
    }

    final String variants = builder.toString();
    StringBuilder result = new StringBuilder();

    for(int i=0; i<8; i++){
      result.append(variants.charAt(RandomInRange.randomIntInRang(new Random(), 0,
          variants.length()-1)));
    }

    return result.toString();
  }

}
