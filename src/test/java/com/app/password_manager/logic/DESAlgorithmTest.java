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
//    "Mama ama kr",
//    "Hello world, adlkfkldaklfadf",
    "Rap akfkpepkfpk eqjf jqekjfk eqjkfj eq"
//    "eqj jeqfjeqjfjheq jhfjheq jfhjeqh jfheqjhf jqehjf hqe",
//     "aadkfjkldjafj kl2jk34jfl kj42lkklf 24kj flk24k 2l fj2lk4j lfj2k4j fl24jlk fjk24jk f2l4"
  };

  @Test
  public void encryptAndDecryptTest() throws Exception {

    DESAlgorithm des = new DESAlgorithm();

    for(int i=0; i<keys.length; i++){
      final String key = keys[i];
      for(int j =0; j<messages.length; j++){
        final String message = messages[j];
        final int messageLength = message.length();

        final String encrypted = des.encryptPlainText(key, String.format("%s",message));
        final String decrypted = des.decryptPlainText(key, encrypted).substring(0, messageLength);

        boolean isOk = decrypted.equals(message);
        System.out.println(decrypted);
        System.out.println(isOk);


        if(!isOk) throw new Exception("Initial message is not equal to (crypted->decrypted) message !!!");

      }
    }

  }

}
