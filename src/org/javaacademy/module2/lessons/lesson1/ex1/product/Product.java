package org.javaacademy.module2.lessons.lesson1.ex1.product;

public abstract class Product {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
