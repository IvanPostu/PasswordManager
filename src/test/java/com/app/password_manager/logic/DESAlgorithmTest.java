package com.app.password_manager.logic;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;


public class DESAlgorithmTest {


  private final String messages[] = {
      "Any fool can write code that a computer can understand. " +
          "Good programmers write code than humans can understand.",
      "Code is like humor. When you have to explain it, it\'s bad.",
      "First, solve the problem. Then, write the code.",
      "Programming is the art of telling another human what one wants the computer to do.",
      "Don\'t comment bad code - rewrite it.",
  };

  @Test
  public void StringToHexAndHexToStringTest() throws Exception {
    final String localMessages[] = messages.clone();

    byte[] bytes = {2, 3, 4, 5, 6, 7, 8, 88, 99};
    for (byte b : bytes) localMessages[0] += (char) b;

    for (String s : localMessages) {
      String hex = DESAlgorithm.rawStringToHexString(s);
      String raw = DESAlgorithm.hexStringToRawString(hex);

      if (!s.equals(raw)) throw new Exception();
    }

  }

  @Test
  public void encryptAndDecryptTest() throws Exception {

    List<String> keys = new LinkedList<>();
    for(int i=0; i<10; i++) keys.add(Key8ByteGenerator.generate());

    for (final String key : keys) {
      for (final String message : messages) {
        final int initialMessageLength = message.length() * 2;


        String encrypted = DESAlgorithm.encrypt(message, key);
        String decrypted = DESAlgorithm.decrypt(encrypted, key, initialMessageLength);
        if (!message.equals(decrypted)) throw new Exception("The DES Algorithm doesn't work correctly!!!");
      }
    }

  }

}
