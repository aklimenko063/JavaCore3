package org.example.lessons.lesson9.ex4;

import java.io.Closeable;

/**
 * Пример создания класса, с интерфейсом Closeable
 * Интерфейс Closeable позволяет использовать экземпляр класса в try with resources
 */
public class Microwave implements Closeable {
    private boolean hasElectricity = true;

    public void work() {
        System.out.println("Работает микроволновка");
    }

    /**
     * try with resources автоматически вызовет данный метод
     */
    @Override
    public void close() {
        System.out.println("Микроволновка отключена");
    }
}