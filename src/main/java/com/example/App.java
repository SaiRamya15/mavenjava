/*package com.example;

public class App {
    public String getMessage() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}*/


package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started.");
    }

    public String getGreeting() {
        logger.debug("getGreeting() called");
        return "Hello from App!";
    }
}
