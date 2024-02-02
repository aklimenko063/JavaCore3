package org.javaacademy.module2.lessons.lesson8.ex1;

import java.util.Objects;

public class Human {
    private String passportNumber;

    public Human(int passportNumber) {
        this.passportNumber = "ab №" + passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(passportNumber, human.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public String toString() {
        return "Human{" +
                "passportNumber=" + passportNumber +
                '}';
    }

    public void handsUp() throws Exception {
        System.out.println("Поднимает руку");
        throw new Exception("Ошибка, руки забыл опустить");
    }
}
