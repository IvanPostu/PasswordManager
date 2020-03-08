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
      "12345678",

  };

  @Test
  public void StringToHexAndHexToStringTest() throws Exception {
    final String messages[] = {
        "qwertyui iuu 98afu98adu9f8 adu89 fadf uda9f adu9f aduf9 aud9f ",
        "8uUUzml1adfi ueuqu f28eu f98uq89fu8 uquf 8u q89uf89q ue89uf uqefu qe98uqe",
        "ADFHJADH FJADK FADHF HJADHFK DAHF 42Y2 F72Y4F H24FH24HF 24F24",
        "F2 4UHUFH2 4HF24 HFH42H FU24HFUI24FHI 24HUIFH 24IUF HIU42HF U42IHF 42H U24HU 27y4724y7472",
        "11"
    };

    byte[] bytes = {2, 3, 4, 5, 6, 7, 8, 88, 99};
    for (byte b : bytes) messages[4] += (char) b;

    for (String s : messages) {
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

        String messageInHex = DESAlgorithm.rawStringToHexString(message);

        String encrypted = DESAlgorithm.execute(messageInHex,
            DESAlgorithm.rawStringToHexString(key),
            DESAlgorithm.Type.ENCRYPT);

        String decrypted = DESAlgorithm.execute(encrypted,
            DESAlgorithm.rawStringToHexString(key),
            DESAlgorithm.Type.DECRYPT);

        if(!messageInHex.equals(decrypted)) throw  new Exception("The DES Algorithm doesn't work correctly!!!");

      }
    }

  }

}
