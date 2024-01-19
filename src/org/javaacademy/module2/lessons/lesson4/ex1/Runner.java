package org.javaacademy.module2.lessons.lesson4.ex1;

public class Runner {
    public static void main(String[] args) {
        Item phone = new Item("Телефон");
        Item pen = new Item("Телефон");
        System.out.println(phone.equals(pen));
        System.out.println("___________________________________________");

        System.out.println(phone.hashCode());
        //System.out.println(phone.hashCode());
        System.out.println(pen.hashCode());
    }
}
