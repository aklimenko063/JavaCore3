package org.example.module1.lessons.lesson6.example2;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("Человек говорит");
    }

    public void live() {
        System.out.println("живу");
    }
}