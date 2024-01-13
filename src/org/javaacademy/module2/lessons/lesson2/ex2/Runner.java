package org.javaacademy.module2.lessons.lesson2.ex2;

public class Runner {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C", "D"};
        //O(1) - константное время
        String string = strings[0];
        //O(n) - перебор всех элементов
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("___________________________________________");
        //O(n^2)
        for (String el1 : strings) {
            for (String el2 : strings) {
                System.out.println(el1 + el2);
            }
        }
        //O(log(n) - найти 7
        //        10
        //    5       15
        //  2   7   12
    }
}
