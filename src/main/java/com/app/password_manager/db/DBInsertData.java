package com.app.password_manager.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBInsertData {

  public static DataModel insertDataInDatabase(final DataModel dataModel){

    final String sql = "" +
        "INSERT INTO all_data" +
        "(enc_pass, dec_length, service_name, `key`) " +
        "VALUES(?,?,?,?)";

    try (Connection conn = DBConnector.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, dataModel.getEncryptedPassword());
      pstmt.setInt(2, dataModel.getDecryptedPasswordLength());
      pstmt.setString(3, dataModel.getServiceName());
      pstmt.setString(4, dataModel.getEncryptionKey());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }

}
