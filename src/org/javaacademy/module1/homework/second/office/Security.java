package org.javaacademy.homework.second.office;

public class Security {
    private static final String employee = "Охранник";
    private String name;

    public Security(String name) {
        this.name = name;
    }

    public void speech () {
        System.out.printf("%s: - Сколько можно!!! Дайте мне аванс!\n", employee);
    }

    public String getName() {
        return name;
    }
}