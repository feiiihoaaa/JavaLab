package org.example;

abstract class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}