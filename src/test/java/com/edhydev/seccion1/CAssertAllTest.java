package com.edhydev.seccion1;

import com.edhydev.example.service.SmartPhoneService;
import com.edhydev.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CAssertAllTest {

    @Test
    void assertAllTest() {

        // Class Under Test
        // System Under Test (SUT)
        SmartPhoneService service = new SmartPhoneServiceImpl();

        Integer count = service.count();

        // assertions
        assertAll("Comprobaciones",
                () -> assertNotNull(count),
                () -> assertTrue(count > 0),
                () -> assertEquals(3, count)
        );

    }

}
