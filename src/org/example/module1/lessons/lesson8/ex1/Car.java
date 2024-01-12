package org.example.module1.lessons.lesson8.ex1;

public class Car {
    private double fuel;

    public Car(double fuel) {
        this.fuel = fuel;
    }

    public void start() throws Exception {
        if (fuel <= 0) {
            throw new Exception("Нет топлива");
        }
        System.out.println("Машина стартует");
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}