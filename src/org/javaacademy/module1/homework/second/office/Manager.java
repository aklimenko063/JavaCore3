package org.javaacademy.homework.second.office;

public class Manager {
    private static final String employee = "Менеджер";
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void speech () {
        System.out.printf("%s: - Я ничего не успеваю, пАмАгите!\n", employee);
    }

    public String getName() {
        return name;
    }
}