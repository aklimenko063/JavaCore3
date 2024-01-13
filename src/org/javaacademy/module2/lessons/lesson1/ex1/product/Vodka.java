package org.javaacademy.module2.lessons.lesson1.ex1.product;

public class Vodka extends Product {
    private double volume;

    public Vodka(int price, double volume) {
        super(price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Vodka{" +
                "volume=" + volume +
                '}';
    }
}
