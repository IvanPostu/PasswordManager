package com.app.password_manager.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DBCreateTables {

  static void createTables() {

    final String sql = "CREATE TABLE IF NOT EXISTS all_data (\n"
        + "    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n"
        + "    enc_pass TEXT NOT NULL,\n"
        + "    dec_length INTEGER NOT NULL,\n"
        + "    service_name TEXT NOT NULL,"
        + "    key TEXT NOT NULL"
        + ");";;

    try (Connection conn = DriverManager.getConnection(DBConnector.DB_URL);
         Statement stmt = conn.createStatement()) {
      stmt.execute(sql);
    } catch ( SQLException e) {
      System.out.println(e.getMessage());
    }
  }

}
