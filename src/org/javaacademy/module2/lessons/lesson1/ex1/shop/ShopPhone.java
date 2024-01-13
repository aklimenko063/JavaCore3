package org.javaacademy.module2.lessons.lesson1.ex1.shop;

import org.javaacademy.module2.lessons.lesson1.ex1.product.Phone;

public class ShopPhone {
    private Phone[] products = new Phone[100];

    public void addProduct(Phone product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Нет пустых полок! Товар не добавлен");
    }

    public Phone saleProduct() {
        for (int i = products.length - 1; i >= 0; i--) {
            if (products[i] != null) {
                Phone product = products[i];
                products[i] = null;
                return product;
            }
        }
        throw new RuntimeException("Товара нет на складе!");
    }
}
