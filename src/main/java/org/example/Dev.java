package org.example;

public class Dev {

    private Computer computer;

    private String experience;
    private int age;

    public Dev() {
        System.out.println("Dev constructor called");
    }

    public Dev(String experience, int age, Computer computer) {
        this.experience = experience;
        this.age = age;
        this.computer = computer;
    }

    public Dev(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public Computer getLaptop() {
        return computer;
    }

    public void setLaptop(Computer computer) {
        this.computer = computer;
    }

    public void build() {
        System.out.print("Level: " + experience);
        System.out.println(", Age: " + age);
        computer.turnOn();
        System.out.println("Dev build method called\n");
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
