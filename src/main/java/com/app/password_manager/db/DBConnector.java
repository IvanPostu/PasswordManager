package com.app.password_manager.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

  public static String DB_PATH = "/home/ivan/SqliteDatabases/PasswordManagerDatabase.db";
  public static String DB_URL = "jdbc:sqlite:"+DB_PATH;

  static Connection connect() {
    String url = DB_URL;
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(url);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

}
