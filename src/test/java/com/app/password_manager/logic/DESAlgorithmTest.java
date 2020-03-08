package com.app.password_manager.logic;


import org.junit.jupiter.api.Test;


public class DESAlgorithmTest {

  private final String keys[] = {
      "qwertyui",
      "8uUUzml1",
      "zxmnuirt",
      "12345678"
  };

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

    for (int i = 0; i < keys.length; i++) {
      final String key = keys[i];
      for (int j = 0; j < messages.length; j++) {
        final String message = messages[j];
        final int initialMessageLength = message.length() * 2;

        String messageInHex = DESAlgorithm.rawStringToHexString(message);

        String encrypted = DESAlgorithm.execute(messageInHex,
            DESAlgorithm.rawStringToHexString(key),
            DESAlgorithm.Type.ENCRYPT);

        String decrypted = DESAlgorithm.execute(encrypted,
            DESAlgorithm.rawStringToHexString(key),
            DESAlgorithm.Type.DECRYPT).substring(0, initialMessageLength);

        if(!messageInHex.equals(decrypted)) throw  new Exception("The DES Algorithm doesn't work correctly!!!");

      }
    }

  }

}
