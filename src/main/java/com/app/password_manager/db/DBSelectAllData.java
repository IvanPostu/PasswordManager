package com.app.password_manager.db;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DBSelectAllData {

  private static String sql = "SELECT * FROM all_data; ";

  public static List<DataModel> selectAll(){

    List<DataModel> result = new LinkedList<>();

    try (Connection conn = DBConnector.connect();
         Statement statement = conn.createStatement()) {

      ResultSet rs = statement.executeQuery(sql);

      while (rs.next()) {
        DataModel model = new DataModel();
        model.setId(rs.getLong("id"));
        model.setEncryptedPassword(rs.getString("enc_pass"));
        model.setDecryptedPasswordLength(rs.getInt("dec_length"));
        model.setServiceName(rs.getString("service_name"));
        model.setEncryptionKey(rs.getString("key"));

        result.add(model);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }


    return result;
  }

}
