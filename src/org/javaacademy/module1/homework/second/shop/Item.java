package org.javaacademy.module1.homework.second.shop;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(" +
                name + ", вес = " + weight + "гр" + ')';
    }
}