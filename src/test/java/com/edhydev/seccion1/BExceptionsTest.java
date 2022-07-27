package com.edhydev.seccion1;

import com.edhydev.example.service.SmartPhoneService;
import com.edhydev.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BExceptionsTest {

    @Test
    void findOneIllegalArgumentExceptionTest() {

        SmartPhoneService service = new SmartPhoneServiceImpl();

        assertThrows(IllegalArgumentException.class, () -> service.findOne(null));

    }

}
