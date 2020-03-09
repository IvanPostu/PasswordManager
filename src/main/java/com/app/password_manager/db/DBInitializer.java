package com.app.password_manager.db;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DBInitializer {

  static public void initializeDatabase(){
    Path path = Paths.get(DBConnector.DB_PATH);
    if (Files.notExists(path)) {
      init();
    }
  }

  static private void init(){
    DBCreateTables.createTables();
  }

}
