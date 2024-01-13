package org.javaacademy.module1.homework.four.ex1.car;

public class Bus extends Car {
    private int maxCountPassenger;

    public Bus(boolean isClean, Dimensions dimensions) {
        super(isClean, dimensions);
    }

    public void setMaxCountPassenger(int maxCountPassenger) {
        this.maxCountPassenger = maxCountPassenger;
    }
}
