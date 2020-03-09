package com.app.password_manager.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataModel implements Cloneable {

  private Long id;
  private String encryptedPassword;
  private Integer decryptedPasswordLength;
  private String serviceName;
  private String encryptionKey;

  @Override
  public Object clone() throws CloneNotSupportedException {
    DataModel cloned = (DataModel)super.clone();
    cloned.setId(this.id);
    cloned.setEncryptedPassword(this.encryptedPassword);
    cloned.setDecryptedPasswordLength(this.decryptedPasswordLength);
    cloned.setServiceName(this.serviceName);
    cloned.setEncryptionKey(this.encryptionKey);

    return cloned;
  }

}
