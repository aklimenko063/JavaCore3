package org.example.homework.third.ex2.components;

public class Camera {
    private final String model;
    private final int zoom;
    private final boolean flash;

    public Camera(String model, int zoom, boolean flash) {
        this.model = model;
        this.zoom = zoom;
        this.flash = flash;
    }

    @Override
    public String toString() {
        return "(" +
                "'" + model + '\'' +
                ", зум - " + zoom +
                "х, вспышка - " + (flash ? "есть" : "нет") +
                ')';
    }
}
