package com.app.password_manager.utils;

import java.util.Random;

public class RandomInRange {

  public static int randomIntInRang(Random rand, int min, int max){
    return min + rand.nextInt(max - min + 1);
  }

}
