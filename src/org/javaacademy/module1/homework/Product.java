package org.javaacademy.module1.homework;

public enum Product {
    SAUSAGE(800), HAM(350), NECK(500);

    private int sellingPrice;

    Product(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}