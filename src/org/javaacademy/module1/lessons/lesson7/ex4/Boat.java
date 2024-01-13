package org.javaacademy.module1.lessons.lesson7.ex4;

public class Boat implements Swim {
    @Override
    public void swim() {
        System.out.println("Лодка плывет");
    }
}