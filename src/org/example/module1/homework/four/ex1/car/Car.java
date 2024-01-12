package org.example.homework.four.ex1.car;

public class Car {
    private boolean isClean;
    private Dimensions dimensions;

    public Car(boolean isClean, Dimensions dimensions) {
        this.isClean = isClean;
        this.dimensions = dimensions;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean getClean() {
        return isClean;
    }
}
