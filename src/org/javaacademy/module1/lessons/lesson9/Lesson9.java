package org.javaacademy.module1.lessons.lesson9;

import org.javaacademy.module1.lessons.lesson9.ex1.Car;

public class Lesson9 {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.start();
        //Пример RuntimeException
        System.out.println(1 / 0);
    }
}