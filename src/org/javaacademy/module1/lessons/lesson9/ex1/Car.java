package org.javaacademy.module1.lessons.lesson9.ex1;

public class Car {
    private Engine engine = new Engine();

    /**
     * Вызов метода старт у двигателя, который выкинет RuntimeException из за Detail
     */
    public void start() {
        engine.start();
    }
}