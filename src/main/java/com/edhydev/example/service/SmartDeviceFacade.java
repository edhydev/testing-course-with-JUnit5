package com.edhydev.example.service;

import com.edhydev.example.domain.SmartDevice;
import com.edhydev.example.domain.SmartPhone;
import com.edhydev.example.domain.SmartWatch;
import com.edhydev.example.domain.pieces.*;

public class SmartDeviceFacade {

    private SmartDeviceFacade() {
    }

    public static SmartDevice createSmartPhone() {
        // smartdevice pieces
        Battery battery = new Battery(1L, 0.0);
        RAM ram = new RAM(1L, "DDR4", 8);
        CPU cpu = new CPU(1L, 4);

        // smartphone exclusive pieces
        Camera camera = new Camera(1L, "front camera", 12.5);

        SmartPhone phone = new SmartPhone(1L, "Default smartphone", ram, battery, cpu, true, camera);
        phone.getCpu().start();

        return phone;
    }

    public static SmartDevice createSmartWatch() {
        // smartdevice pieces
        Battery battery = new Battery(1L, 0.0);
        RAM ram = new RAM(1L, "DDR4", 8);
        CPU cpu = new CPU(1L, 4);

        // smartphone exclusive pieces
        HealthMonitor monitor = new HealthMonitor(1L, 0.0, 0);

        return new SmartWatch(1L, "Default smartwatch", ram, battery, cpu, true, monitor);
    }
}
