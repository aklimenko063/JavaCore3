package org.javaacademy.module2.lessons.lesson1.ex1.product;

public class Shoes extends Product {
    private int size;

    public Shoes(int price, int size) {
        super(price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
