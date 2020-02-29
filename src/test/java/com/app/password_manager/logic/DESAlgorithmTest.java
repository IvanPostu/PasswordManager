package com.app.password_manager.logic;


import com.app.password_manager.utils.HexStringToByteArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class DESAlgorithmTest {

  @Test
  public void encryptTest() throws Exception {
    final byte[] key = "abcdefgh".getBytes();
    final byte[] rawText = "qwertyuiqwertyui".getBytes();

    DESAlgorithm desAlgorithm = new DESAlgorithm(key);
    final byte[] encryptedText = desAlgorithm.encrypt(rawText);

    final byte[] result = HexStringToByteArray.
        hexStringToByteArray("83b695ab8334db6f83b695ab8334db6f");

    if(!Arrays.equals(encryptedText, result)){
      throw new Exception("Error");
    }


  }


}
