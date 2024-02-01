package org.javaacademy.module2.lessons.lesson6.ex7_consumer;

public interface Hospital<T extends Animal> {

    void heal(T animal);
}
