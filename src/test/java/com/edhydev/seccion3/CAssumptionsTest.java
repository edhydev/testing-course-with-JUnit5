package com.edhydev.seccion3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

public class CAssumptionsTest {

    @BeforeAll
    static void beforeAll() {
        System.getenv().forEach((key, value) -> System.out.println(key + " -" + value));

        System.getProperties().forEach((key, value) -> System.out.println(key + " -" + value));
    }

    @Test
    void test1() {
        String jdk = System.getProperty("java.home");
        assumeTrue(jdk.contains("jdk1.8.0"));
        assumeFalse(jdk.contains("jdk-11"));

        System.out.println("El test continua");
    }

    @Test
    void test2() {
        String jdk = System.getProperty("java.home");
        assumingThat(jdk.contains("jdk1.8.0"), () -> {
            System.out.println("Todo bien :)");
        });
    }

}