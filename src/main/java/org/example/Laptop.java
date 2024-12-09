package org.example;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop constructor called");
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turned on, mate");
    }
}
