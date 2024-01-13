package org.javaacademy.module1.lessons.lesson11.ex3;

public abstract class Car {
    protected  Transmission transmission;

    public Car(Transmission transmission) {
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
