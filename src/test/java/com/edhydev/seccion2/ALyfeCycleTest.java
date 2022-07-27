package com.edhydev.seccion2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ALyfeCycleTest {

    @BeforeEach
    void setUp() {

        System.out.println("setUp");

    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");

    }

    @BeforeAll
    static void beforeAll() {

        System.out.println("beforeAll");

    }

    @AfterAll
    static void afterAll() {

        System.out.println("afterAll");

    }

}
