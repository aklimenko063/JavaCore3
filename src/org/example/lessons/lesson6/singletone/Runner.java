package org.example.lessons.lesson6.singletone;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
    }
}