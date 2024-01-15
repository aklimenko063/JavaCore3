package org.javaacademy.module2.homework.Homework1.ex1;

import org.javaacademy.module2.homework.Homework1.ex1.zoo.*;

/*Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
Создать зоопарк, который может хранить в себе трех животных.
Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
Без дженериков задание принято не будет.*/
public class Runner {
    public static void main(String[] args) {
        Zoo<Dog> dogZoo = new Zoo<>(new Dog());
        dogZoo.getAnimal1().bark();

        Zoo<Tiger> tigerZoo = new Zoo<>(new Tiger());
        tigerZoo.getAnimal1().growl();

        Zoo<Bird> birdZoo = new Zoo<>(new Bird());
        birdZoo.getAnimal1().fly();

//        ZooRight<Animal> animalZooRight = new ZooRight<>();
//        animalZooRight.getZoo().add(new Dog());
//        animalZooRight.getZoo().add(new Bird());
//        animalZooRight.getZoo().add(new Tiger());
//
//        Animal animal = animalZooRight.getZoo().get(0);
//        animal.
    }
}
