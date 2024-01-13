package org.javaacademy.module1.lessons.lesson11.ex2;

public class City {
    public static final City SAINT_PETERSBURG = new City("Saint-Petersburg");
    public static final City MOSCOW = new City("Moscow");
    private String name;

    private City(String city) {
        this.name = city;
    };

    public String getName() {
        return name;
    }
}
