package org.example.homework.second.office;

public class Manager {
    String employee = "Менеджер";
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public void speech () {
        System.out.printf("%s: - Я ничего не успеваю, помогите!\n", employee);
    }
}