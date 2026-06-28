package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testGetGreeting() {
        String greeting = App.getGreeting();
        assertNotNull(greeting, "Greeting should not be null");
        assertEquals("Hello, Maven & GitHub!", greeting, "Greeting message matches");
    }
}
