package org.example;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop constructor called\n");
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop is turned on, mate");
    }
}
