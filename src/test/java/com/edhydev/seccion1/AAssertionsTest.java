package com.edhydev.seccion1;

import com.edhydev.example.service.SmartPhoneService;
import com.edhydev.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AAssertionsTest {
    @Test
    void count() {

        SmartPhoneService service = new SmartPhoneServiceImpl();

        Integer count = service.count();

        // assertions
        assertNotNull(count);
        assertTrue(count > 0);
        assertEquals(3, count);
        assertEquals(3, count + 1, "El número de elementos esperado es 3");
    }
}
