package com.edhydev.seccion3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BConditionalTest {

    // JRE

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void test1() {
        System.out.println("test1 JAVA 8");
    }

    @EnabledOnJre(JRE.JAVA_16)
    @Test
    void test2() {
        System.out.println("test2 JAVA 16");
    }

    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_16)
    @Test
    void test3() {
        System.out.println("test3 range JRE(8 - 16)");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void test4() {
        System.out.println("test4 for Linux");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void test5() {
        System.out.println("test5 for Windows");
    }

    @Test
    void printEnv() {
        System.getenv().forEach((key, value) -> System.out.println(key + " -" + value));

        System.getProperties().forEach((key, value) -> System.out.println(key + " -" + value));
    }

}
