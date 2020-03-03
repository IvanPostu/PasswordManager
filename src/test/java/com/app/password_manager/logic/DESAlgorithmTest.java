package com.app.password_manager.logic;


import org.junit.jupiter.api.Test;



public class DESAlgorithmTest {


  @Test
  public void encryptAndDecryptTest() throws Exception {

    DESAlgorithm des = new DESAlgorithm();
    des.encryptPlainText("qwertyui", "abcdefghabcdefgh1");


//    byte[] message = des.hexStringToByteArray("123456789ABCDEF");
//    System.out.println("PLAIN TEXT:");
//    des.printBytes(message);
//    byte[] key =  des.hexStringToByteArray("133457799BBCDFF1");
//    System.out.println("KEY:");
//    des.printBytes(key);
//    byte[] cipher = des.crypt(message, key, "encrypt");
//    System.out.println("CIPHER TEXT:");
//    des.printBytes(cipher);
//    byte[] result = des.crypt(cipher, key, "decrypt");
//    System.out.println("DECRYPTED TEXT:");
//    des.printBytes(result);

  }

}
