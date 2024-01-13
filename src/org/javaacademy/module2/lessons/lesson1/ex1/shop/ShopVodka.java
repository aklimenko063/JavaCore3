package org.javaacademy.module2.lessons.lesson1.ex1.shop;

import org.javaacademy.module2.lessons.lesson1.ex1.product.Vodka;

public class ShopVodka {
    private Vodka product;

    public void addProduct(Vodka product) {
        this.product = product;
    }

    public Vodka saleProduct() {
        if (product != null) {
            Vodka saledProduct = product;
            product = null;
            return saledProduct;
        }
        throw new RuntimeException("Товара нет на складе!");
    }
}
