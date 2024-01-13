package org.javaacademy.module2.lessons.lesson1.ex1.shop;

import org.javaacademy.module2.lessons.lesson1.ex1.product.Product;

public class Shop <T extends Product> {
    private T product;
    private int totalIncome = 0;

    public void addProduct(T product) {
        this.product = product;
    }

    public T saleProduct() {
        if (product != null) {
            T saledProduct = product;
            totalIncome += product.getPrice();
            product = null;
            return saledProduct;
        }
        throw new RuntimeException("Товара нет на складе!");
    }

    public int getIncome() {
        return totalIncome;
    }
}
