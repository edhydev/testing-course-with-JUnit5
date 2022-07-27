package com.edhydev.seccion3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ADisabledTest {

    @Test
    @Disabled("Unit bug #1046 fix")
    void test1() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Test
    @Disabled("Until feature #6126")
    void test2() {
        System.out.println("test2");
        assertTrue(true);
    }

}
