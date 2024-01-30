package org.javaacademy.module2.lessons.lesson6.ex6_supplier;

import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        Supplier<Milk> supplier = () -> new Milk();
        Milk milk = supplier.get();
        Milk milk2 = supplier.get();

        System.out.println(milk);
        System.out.println(milk2);
    }
}
