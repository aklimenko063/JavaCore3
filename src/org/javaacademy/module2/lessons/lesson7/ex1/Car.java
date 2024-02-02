package org.javaacademy.module2.lessons.lesson7.ex1;

public class Car {
    /**
     * Принимает в себя функцию. Т.е является функцией высшего порядка
     */
    public void start(Runnable runnable) {
        runnable.run();
        System.out.println("Машина запущена");
    }
}
