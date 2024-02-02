package org.javaacademy.module2.homework.homework3.ex3;

public class Human {
    private double height;
    private int age;
    private String name;

    public Human(double height, int age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
