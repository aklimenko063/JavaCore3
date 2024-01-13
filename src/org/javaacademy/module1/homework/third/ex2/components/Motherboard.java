package org.javaacademy.module1.homework.third.ex2.components;

public class Motherboard {
    private final String model;
    private final int width;
    private final int length;
    private final int height;

    public Motherboard(String model, int width, int length, int height) {
        this.model = model;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "(" +
                "модель - '" + model + '\'' +
                ", гараритные размеры - " + width +
                "х" + length +
                "х" + height +
                ")";
    }
}
