package org.example.homework.second.office;

public class Security {
    String employee = "Охранник";
    String name;

    public Security(String name) {
        this.name = name;
    }

    public void speech () {
        System.out.printf("%s: - Сколько можно!!! Дайте мне аванс!\n", employee);
    }
}