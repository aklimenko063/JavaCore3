package org.javaacademy.module2.lessons.lesson6.ex7_consumer;

public class Runner {
    public static void main(String[] args) {
        Hospital<Human> hospitalHuman = animal -> {
            System.out.println("вылечили человека");
            animal.setInjured(false);
        };
        Human human = new Human();
        hospitalHuman.heal(human);
        System.out.println(human);

        Hospital<Cat> catHospital = animal -> {
            System.out.println("лечим кота");
            animal.setInjured(false);
        };
        Cat cat = new Cat();
        catHospital.heal(cat);

        System.out.println(cat);
    }
}
