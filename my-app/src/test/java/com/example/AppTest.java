package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for App class.
 */
public class AppTest {

    private final App app = new App();

    @Test
    void testAddSuccess() {
        // Successful scenario
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(-2, 2));
    }

    @Test
    void testSubtractSuccess() {
        // Successful scenario
        assertEquals(1, app.subtract(3, 2));
        assertEquals(-4, app.subtract(-2, 2));
    }

    @Test
    void testAddFailure() {
        // Failure scenario for demo
        // Uncomment this to simulate test failure in PR
        // assertEquals(10, app.add(2, 3));
    }

    @Test
    void testSubtractFailure() {
        // Failure scenario for demo
        // Uncomment this to simulate test failure in PR
        // assertEquals(0, app.subtract(3, 2));
    }
}
