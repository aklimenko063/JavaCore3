package org.example.homework.four.ex1.car;

public class PassengerCar extends Car {
    private boolean hasCruise;

    public PassengerCar(boolean isClean, Dimensions dimensions) {
        super(isClean, dimensions);
    }

    public void setHasCruise(boolean hasCruise) {
        this.hasCruise = hasCruise;
    }
}
