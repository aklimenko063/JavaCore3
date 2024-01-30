package org.javaacademy.module2.homework.homework3.ex4;

/**
 * Аналог Consumer
 * */
@FunctionalInterface
public interface Burning<T> {
    void burn(T t);
}
