package org.javaacademy.module2.homework.homework3.ex3;

/**
 * Аналог Predicate
 * */
@FunctionalInterface
public interface Divination<T> {
    boolean answer(T t);
}
