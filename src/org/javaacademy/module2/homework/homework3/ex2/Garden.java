package org.javaacademy.module2.homework.homework3.ex2;

/**
 * Аналог Supplier
 * */
@FunctionalInterface
public interface Garden<T extends Fruit> {
    T cultivation();
}
