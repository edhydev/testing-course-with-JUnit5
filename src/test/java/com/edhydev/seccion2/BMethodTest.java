package com.edhydev.seccion2;

import com.edhydev.example.service.SmartPhoneService;
import com.edhydev.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BMethodTest {

    SmartPhoneService service;

    @BeforeEach
    void setUp() {
        System.out.println("setup");
        service = new SmartPhoneServiceImpl();
    }

    @AfterEach
    void tearDown() {
        System.gc();
        System.out.println("tearDown");
    }

    @Test
    void test1() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Test
    void test2() {
        System.out.println("test2");
        assertTrue(true);
    }

}
