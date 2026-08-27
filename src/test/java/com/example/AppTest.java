package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    void applicationTest() {
        String message = "Hello from the Jenkins Maven Pipeline!";

        assertTrue(message.contains("Jenkins"));
    }
}
