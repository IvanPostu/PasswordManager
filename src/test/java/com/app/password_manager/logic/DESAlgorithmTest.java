package com.app.password_manager.logic;


import org.junit.jupiter.api.Test;



public class DESAlgorithmTest {

  private final String[] rawTexts = {
      "abcdefgh"
  };

  private final String[] keys = {
      "qwertyui"
  };


  @Test
  public void encryptAndDecryptTest() throws Exception {
//
//    Arrays.stream(keys).forEach( key -> {
//      DESAlgorithm desAlgorithm = new DESAlgorithm(key.getBytes());
//
//      for(String s : this.rawTexts){
//        final byte[] encryptedBytes = desAlgorithm.encrypt(s.getBytes());
//        final byte[] decryptedBytes = desAlgorithm.decrypt(encryptedBytes);
//        String initialText = new String(decryptedBytes);
//
//        char a = 'a';
//      }
//    });
//


    for (String key : keys) {
      DESAlgorithm myDes = new DESAlgorithm(key);
      for (String text : rawTexts) {
        String encryptedText = myDes.encrypt(text);
        for(byte b : encryptedText.getBytes()) System.out.printf("%x", b);

        System.out.println("\n\n");

        String encryptedText1 = myDes.encrypt(text);
        for(byte b : encryptedText1.getBytes()) System.out.printf("%x", b);
      }
    }


  }

}
