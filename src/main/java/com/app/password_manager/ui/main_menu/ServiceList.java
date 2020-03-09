package com.app.password_manager.ui.main_menu;

import javax.swing.*;
import java.awt.*;

public class ServiceList extends MainMenu {


  static private String categories[] = { "Household", "Office", "Extended Family",
      "Company (US)", "Company (World)", "Team", "Will",
      "Birthday Card List", "High School", "Country", "Continent",
      "Planet", "Office", "Extended Family",
      "Company (US)", "Company (World)", "Team", "Will",
      "Birthday Card List", "High School", "Country", "Continent",
      "Planet", "Office", "Extended Family",
      "Company (US)", "Company (World)", "Team", "Will",
      "Birthday Card List", "High School", "Country", "Continent",
      "Planet", "Office", "Extended Family",
      "Company (US)", "Company (World)", "Team", "Will",
      "Birthday Card List", "High School", "Country", "Continent",
      "Planet", "Office", "Extended Family",
      "Company (US)", "Company (World)", "Team", "Will",
      "Birthday Card List", "High School", "Country", "Continent",
      "Planet", "Office", "Extended Family",
      "Company (US)", "Company (World)", "Team", "Will",
      "Birthday Card List", "High School", "Country", "Continent",
      "Planet", "Office", "Extended Family",
      "Company (US)", "Company (World)", "Team", "Will",
      "Birthday Card List", "High School", "Country", "Continent",
      "Planet" };

  public ServiceList() {
    super();


//    JPanel test = new JPanel();
//    test.setPreferredSize(new Dimension( 2000,2000));
//    JScrollPane scrollFrame = new JScrollPane(test);
//    test.setAutoscrolls(true);
//    scrollFrame.setPreferredSize(new Dimension( 800,300));
//    this.add(scrollFrame);

    JList<String> services = new JList<>(categories);


    JScrollPane scrollbar = new JScrollPane(services);
    services.setAutoscrolls(true);
    scrollbar.setBounds(5,5, width-20, height-50);
    add(scrollbar, BorderLayout.CENTER);

  }

}
