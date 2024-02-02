package org.javaacademy.module2.lessons.lesson7.ex1;

public class Runner {
    public static void main(String[] args) {
        //Создание функции (низшего порядка)
        Runnable functionEngineRun = () -> System.out.println("Движок запущен");
        //functionEngineRun.run();

        Car car = new Car();
        //Передача функции в другую функцию
        car.start(functionEngineRun);
    }
}
