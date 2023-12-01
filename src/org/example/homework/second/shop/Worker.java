package org.example.homework.second.shop;

public class Worker {
    String name;
    int age;
    String sex;
    Item[] items;

    public Worker (String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void boasting (Item item) {
        System.out.println(this.name + ": смотрите какая у меня вещь - " + item.name);
    }
}