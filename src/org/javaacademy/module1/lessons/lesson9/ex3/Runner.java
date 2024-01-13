package org.javaacademy.module1.lessons.lesson9.ex3;

public class Runner {
    /**
     * Пример работы блока finally. Блок finally позволяет делать действие в независимости от
     * исхода действия. В данном случае мы открываем машину, и в независимости от того запустится она
     * или нет, нам нужно будет закрыть машину.
     */
    public static void main(String[] args) {
        Car car = new Car(1);
        car.open();
        try {
            car.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            car.close();
        }
    }
}