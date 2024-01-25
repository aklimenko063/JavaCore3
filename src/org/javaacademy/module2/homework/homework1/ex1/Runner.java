package org.javaacademy.module2.homework.homework1.ex1;

import org.javaacademy.module2.homework.homework1.ex1.zoo.*;

/**Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
Создать зоопарк, который может хранить в себе трех животных.
Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
Без дженериков задание принято не будет.*/
public class Runner {
    public static void main(String[] args) {
        Zoo<Dog, Bird, Tiger> zoo = new Zoo<>(new Dog(), new Bird(), new Tiger());
        zoo.getAnimal1().bark();
        zoo.getAnimal2().fly();
        zoo.getAnimal3().growl();
    }
}
