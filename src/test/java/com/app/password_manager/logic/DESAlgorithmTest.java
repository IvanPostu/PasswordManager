package com.app.password_manager.logic;


import com.app.password_manager.utils.HexStringToByteArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class DESAlgorithmTest {

  private final String[] rawTexts = {
      "HelloWorld",
      "Tank1347317943714",
      "0987134314913473198473918749317498317984798137498314",
      "kajdhfuwehufhu24u24hiuh2i4uug24",
      "u24hfu9f9u24hugh4u2hg24uh4iu2g"
  };

  private final String[] keys = {
      "qwertyui",
      "abcdefgh"
  };


  @Test
  public void encryptAndDecryptTest() throws Exception{
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




  }

//  @Test
//  public void encryptTest() throws Exception {
//    final byte[] key = "abcdefgh".getBytes();
//    final byte[] rawText = "qwertyui".getBytes();
//
//    DESAlgorithm desAlgorithm = new DESAlgorithm(key);
//
//    final byte[] encryptedText = desAlgorithm.encrypt(rawText);
//
//    for(byte b : "qwertyui".getBytes()) System.out.printf("%x", b);
//    System.out.println();
//
//    for(byte b : encryptedText) System.out.printf("%x", b);
//    System.out.println();
//
//    final byte[] decryptedText = desAlgorithm.decrypt(encryptedText);
//    for(byte b : decryptedText) System.out.printf("%x", b);
//    System.out.println();
//
//
////    if(!Arrays.equals(encryptedText, result)){
////      throw new Exception("Error");
////    }
//
//
//  }


}
