package org.example.AnologyWithFactory;

//Analogy:
//CarFactory = Spring IoC Container
//Factory's getCar(Audi.class) = Spring's getBean("audi")
//XML Config = The "blueprint" for what Spring creates and how objects are connected.
//This abstraction saves us from writing repetitive factory code and lets you focus on your application's logic.

public class KindaLikeBeansFactory {

    public static void main(String[] args) {
        Car audi = CarFactory.getCar(Audi.class);
        audi.drive();

        Car bmw = CarFactory.getCar(BMW.class);
        bmw.drive();

        Car mercedes = CarFactory.getCar(Mercedes.class);
        mercedes.drive();
    }
}

class CarFactory {
    public static Car getCar(Class<? extends Car> carClass) {
        try {
            // Use reflection to create a new instance of the given class
            return carClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Car creation failed: " + e.getMessage());
        }
    }
}

interface Car {
    void drive();
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an Audi!");
    }
}

class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a BMW!");
    }
}

class Mercedes implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Mercedes!");
    }
}

