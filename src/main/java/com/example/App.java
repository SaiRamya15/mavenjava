/*package com.example;

public class App {
    public String getMessage() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}*/

import java.util.logging.Logger;

class App {

  Logger logger = Logger.getLogger(getClass().getName());

  public void doSomething() {
    // ...
    logger.info("My Message");  // Compliant, output via logger
    // ...
  }
}
