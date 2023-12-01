package org.example.homework.second.office;

public class Boss {
    String employee = "БОСС";
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public void speech (String managerName) {
        System.out.printf("%s: - %s, давай быстрее!\n",
                employee, managerName);
    }
}