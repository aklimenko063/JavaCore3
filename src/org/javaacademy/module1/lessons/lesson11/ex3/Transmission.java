package org.javaacademy.module1.lessons.lesson11.ex3;

public enum Transmission {
    AUTO(10), HAND(5);

    private int volume;

    Transmission(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
