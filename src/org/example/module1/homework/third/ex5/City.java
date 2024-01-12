package org.example.homework.third.ex5;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = createDeepCopyOfHouseInMassiv(houses);
    }

    @Override
    public String toString() {
        return "город - " + name +
                ", дома - " + Arrays.toString(houses);
    }

    private static House[] createDeepCopyOfHouseInMassiv(House[] houses) {
        House[] copyHouses = new House[houses.length];
        for (int i = 0 ; i < houses.length; i++) {
            copyHouses[i] = new House(houses[i].getStreet(), houses[i].getHouseNumber());
        }
        return copyHouses;
    }
}
