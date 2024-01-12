package org.example.homework.second.shop;

public class Worker {
    private String name;
    private int age;
    private String sex;
    private Item[] items;

    public Worker (String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void boasting (Item item) {
        System.out.println(this.name + ": смотрите какая у меня вещь - " + item.getName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}