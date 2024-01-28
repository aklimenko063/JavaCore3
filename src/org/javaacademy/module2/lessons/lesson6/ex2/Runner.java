package org.javaacademy.module2.lessons.lesson6.ex2;

public class Runner {
    public static void main(String[] args) {
        Fruit apple = new Fruit("apple");
        printFruitName(apple);
    }

    private static void printFruitName(Fruit fruit) {
        System.out.println(getFruitName(fruit));
    }

    private static String getFruitName(Fruit fruit) {
        return fruit.getName();
    }
}
