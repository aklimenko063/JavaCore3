package org.javaacademy.module2.lessons.lesson1.ex2.output;



public class Monitor implements Output {
    @Override
    public void outputInformation() {
        System.out.println("Вывод на экран");
    }

    public void changeBright() {
        System.out.println("Изменили яркость экрана");
    }
}
