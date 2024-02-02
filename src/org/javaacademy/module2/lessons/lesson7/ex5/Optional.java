package org.javaacademy.module2.lessons.lesson7.ex5;

/**
 * Класс обертка над значением, для защиты от NullPointerException
 */
public class Optional {
    private String value;

    public Optional(String value) {
        this.value = value;
    }

    public String getValue() {
        if (value == null) {
            throw new RuntimeException("Null value");
        }
        return value;
    }

    public String orElse() {
        if (value == null) {
            return "Заглушка";
        }
        return value;
    }
}
