package com.app.password_manager.logic;


import com.app.password_manager.utils.RandomInRange;
import com.sun.istack.internal.Nullable;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;
import java.util.Random;


@NoArgsConstructor
public class PasswordGeneratorSimpleImpl implements IPasswordGenerator {

  private static final String alphabet =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
      new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toLowerCase() +
      "_$" +
      "0123456789";

  private static final int[] RANGE = {7, 10, 14, 18, 22};

  private int complexityToPasswordLength(@Nullable Complexity complexity) {

    Random rand = new Random();

    if (complexity == null)
      return RandomInRange.randomIntInRang(rand, RANGE[2], RANGE[3]);


    switch (complexity) {
      case EASY:
        return RandomInRange.randomIntInRang(rand, RANGE[0], RANGE[1]);
      case MEDIUM:
        return RandomInRange.randomIntInRang(rand, RANGE[1], RANGE[2]);
      case HARD:
        return RandomInRange.randomIntInRang(rand, RANGE[2], RANGE[3]);
      case VERY_HARD:
        return RandomInRange.randomIntInRang(rand, RANGE[3], RANGE[4]);
      default:
        return 10;
    }
  }

  @Override
  public String generatePassword(Complexity complexity) {

    int passwordLength = this.complexityToPasswordLength(complexity);
    int alphabetLength = alphabet.length();
    SecureRandom random = new SecureRandom();
    StringBuilder resultBuilder = new StringBuilder();

    for(int i=0; i<passwordLength; i++){
      char c = alphabet.charAt(RandomInRange.randomIntInRang(random, 0, alphabetLength));
      resultBuilder.append(c);
    }


    return resultBuilder.toString();
  }

  @Override
  public String generatePassword() {
    return this.generatePassword(null);
  }
}
