package org.example.homework.second.shop;

public class Item {
    String name;
    int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" +
                name + ", вес = " + weight + "гр" + ')';
    }
}