package com.app.password_manager.logic;


import org.junit.jupiter.api.Test;



public class DESAlgorithmTest {

  private final String[] keys = {
      "qwertyui"
  };

  private final String[] rawTexts = {
      "abcdefgh"
  };

  @Test
  public void encryptAndDecryptTest() throws Exception {

    for (String key : keys) {
      DESAlgorithm myDes = new DESAlgorithm(key);
      for (String text : rawTexts) {
        String encryptedText = myDes.encrypt(text);
        for(byte b : encryptedText.getBytes()) System.out.printf("%x", b);

        String decryptedText = myDes.decrypt(encryptedText);
        System.out.println();

        System.out.println(decryptedText);

        System.out.println("\n\n");

        String encryptedText1 = myDes.encrypt(text);
        for(byte b : encryptedText1.getBytes()) System.out.printf("%x", b);
        String decryptedText1 = myDes.decrypt(encryptedText1);
        System.out.println();

        System.out.println(decryptedText1);
      }
    }


  }

}
