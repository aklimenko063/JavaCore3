package org.javaacademy.module1.lessons.lesson11.ex2;

public enum CityE {

    MOSCOW("Moscow", 20_000_000),
    SAINT_PETERSBURG("Saint-Petersburg", 8_000_000);

    private String name;
    private int countPeople;

    CityE(String name, int countPeople) {
        this.name = name;
        this.countPeople = countPeople;
    }

    public String getName() {
        return name;
    }

    public int getCountPeople() {
        return countPeople;
    }

}