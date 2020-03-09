package com.app.password_manager.db;

import java.sql.*;

public class DBInsertData {

  private final static String sql = "" +
      "INSERT INTO all_data" +
      "(enc_pass, dec_length, service_name, `key`) " +
      "VALUES(?,?,?,?)";

  public static DataModel insertDataInDatabase(final DataModel dataModel){

    DataModel result = new DataModel();

    try{
      result = (DataModel)dataModel.clone();
    }catch(CloneNotSupportedException ex){
      ex.printStackTrace();
    }

    try (Connection conn = DBConnector.connect();
         PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

      statement.setString(1, dataModel.getEncryptedPassword());
      statement.setInt(2, dataModel.getDecryptedPasswordLength());
      statement.setString(3, dataModel.getServiceName());
      statement.setString(4, dataModel.getEncryptionKey());
      int affectedRows = statement.executeUpdate();

      if (affectedRows == 0) {
        throw new SQLException("Insert statement failed, no rows affected.");
      }

      try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
        if (generatedKeys.next()) {
          Long id = generatedKeys.getLong(1);
          result.setId(id);
        }
        else {
          throw new SQLException("Insert statement failed, no ID obtained.");
        }
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return result;
  }

}
