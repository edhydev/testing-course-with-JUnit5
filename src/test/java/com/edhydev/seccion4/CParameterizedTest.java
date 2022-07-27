package com.edhydev.seccion4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "1, Empleado1, 1000",
            "2, Empleado2, 2000",
            "3, Empleado3, 3000",
            "4, Empleado4, 4000",
            "5, Empleado5, 5000"
    })
    void test1(Long id, String name, Float salary) {
        System.out.println("id: " + id + ", name: " + name + ", salary: " + salary);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/users-data.csv", numLinesToSkip = 1)
    void test2(Long id, String name, Float salary) {
        System.out.println("id: " + id + ", name: " + name + ", salary: " + salary);
    }

    enum Role {
        ADMIN, AUTHOR, ANONYMOUS
    }

    @ParameterizedTest
    @EnumSource(Role.class)
    void test3(Role role) {
        System.out.println("role: " + role);
    }

    @ParameterizedTest
    @MethodSource("namesProvider")
    void test4(String role) {
        System.out.println("name: " + role);
    }

    private static Stream<String> namesProvider() {
        return Stream.of("Name1", "Name2", "Name3", "Name4", "Name5");
    }

}
