package org.javaacademy.module1.lessons.lesson9.ex3;

public class Car {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void start() {
        if (fuel <= 0) {
            throw new RuntimeException("Нет бензина");
        }
        System.out.println("Машина едет");
    }

    public void open() {
        System.out.println("Открыть машину");
    }

    public void close() {
        System.out.println("Закрыть машину");
    }
}