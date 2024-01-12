package org.example.module1.lessons.lesson9.ex1;

public class Engine {
    private Detail detail = new Detail();

    /**
     * Вызов метода work у детали который выкидывает RuntimeException
     */
    public void start()  {
        detail.work();
    }
}