package org.example.homework.third.ex5_1;

import java.util.Arrays;

public final class City {
    private final String name;
    public final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    public House[] getHouses() {
        House[] copyHouses = new House[houses.length];
        for (int i = 0 ; i < houses.length; i++) {
            copyHouses[i] = new House(houses[i]);
        }
        return copyHouses;
    }

    @Override
    public String toString() {
        return "город - " + name +
                ", дома - " + Arrays.toString(houses);
    }
}
