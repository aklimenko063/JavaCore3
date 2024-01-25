package org.javaacademy.module2.homework.homework1.ex1.zoo;

public class Zoo<A extends Animal, B extends Animal, C extends Animal> {
    private A animal1;
    private B animal2;
    private C animal3;

    public Zoo(A animal1, B animal2, C animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public A getAnimal1() {
        return animal1;
    }

    public B getAnimal2() {
        return animal2;
    }

    public C getAnimal3() {
        return animal3;
    }
}
