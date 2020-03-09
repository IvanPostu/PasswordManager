package com.app.password_manager.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataModel {

  private Integer id;
  private String encryptedPassword;
  private Integer decryptedPasswordLength;
  private String serviceName;
  private String encryptionKey;

}
