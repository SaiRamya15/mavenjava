/*package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testApp() {
        assertEquals("Hello", "Hello");
    }
}*/

package com.example;

public class App {
    public String getMessage() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}
