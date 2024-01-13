package org.javaacademy.module2.lessons.lesson1.ex1.product;

public class Phone extends Product {
    public Phone(int price) {
        super(price);
    }

    public void call() {
        System.out.println("Делается звонок");
    }
}
