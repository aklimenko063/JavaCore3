package org.javaacademy.module2.homework.homework3.ex5;

/**
 * Аналог ToIntFunction
 * */
@FunctionalInterface
public interface Scaler<T> {
    int scale(T t);
}
