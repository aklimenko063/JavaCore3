package org.javaacademy.module1.lessons.lesson11.ex2;

public class Tarificator {
    public int getTariff(City city) {
        if (City.SAINT_PETERSBURG == city) {
            return 500;
        } else if (City.MOSCOW == city) {
            return 1000;
        }
        return 2000;
    }

    public int getTariff(CityE city) {
        if (CityE.SAINT_PETERSBURG == city) {
            return 500;
        } else if (CityE.MOSCOW == city) {
            return 1000;
        }
        return 2000;
    }
}
