package org.javaacademy.module1.homework.third.ex5_1;

public class House {
    private String street;
    private int houseNumber;

    public House(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public House(House house) {
        this.street = house.street;
        this.houseNumber = house.houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "улица - " + street +
                ", номер - " + houseNumber;
    }
}
