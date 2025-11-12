package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Device> devices = new HashMap<>();

        devices.put("SM-12345", new Smartphone("Samsung"));
        devices.put("LP-67890", new Laptop("Dell"));
        devices.put("SM-54321", new Smartphone("Apple"));
        devices.put("LP-09876", new Laptop("HP"));

        System.out.println("Ключи:");
        for (String key : devices.keySet()) {
            System.out.println(key);
        }

        System.out.println(devices);
    }
}