package org.javaacademy.module1.homework.second.office;

public class Boss {
    private static final String employee = "БОСС";
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void speech (String managerName) {
        System.out.printf("%s: - %s, давай быстрее!\n",
                employee, managerName);
    }

    public String getName() {
        return name;
    }
}