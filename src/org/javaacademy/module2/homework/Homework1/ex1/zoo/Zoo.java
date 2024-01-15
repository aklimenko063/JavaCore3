package org.javaacademy.module2.homework.Homework1.ex1.zoo;

public class Zoo <A extends Animal> {
    private A animal1;
    private A animal2;
    private A animal3;

    public Zoo(A animal1, A animal2, A animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public void performSpecificAction() {
        animal1.performAction();
        animal2.performAction();
        animal3.performAction();
    }
}
