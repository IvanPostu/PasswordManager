package com.app.password_manager.logic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DESAlgorithmModel {

  private String encryptedHexData;
  private String decryptedData;
  private Integer originalDataLength;

}
