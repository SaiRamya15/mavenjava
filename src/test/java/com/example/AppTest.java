package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetGreeting() {
        App app = new App();
        String result = app.getGreeting();  // ✅ Correct method call
        assertEquals("Hello from App!", result);
    }
}
