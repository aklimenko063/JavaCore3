package org.javaacademy.module2.homework.Homework1.ex1.zoo;

public class Zoo <T extends Animal> {
    private T animal1;
    private T animal2;
    private T animal3;

    public Zoo(T animal1, T animal2, T animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public Zoo(T animal1) {
        this.animal1 = animal1;
    }

    public T getAnimal1() {
        T animal = animal1;
        return animal;
    }

    public T getAnimal2() {
        return animal2;
    }

    public T getAnimal3() {
        return animal3;
    }
}
