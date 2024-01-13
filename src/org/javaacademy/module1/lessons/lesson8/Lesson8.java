package org.javaacademy.module1.lessons.lesson8;

import org.javaacademy.module1.lessons.lesson8.ex1.Car;

/**
 * Работа с исключениями - Exceptions
 */
public class Lesson8 {

    public static void main(String[] args) throws Exception {
        ex1();
        System.out.println("___________________________________________");
        ex2();
    }

    /**
     * Пример выброса проверяемого исключения (Exception) в сигнатуру метода (throws Exception).
     * Машина не может стартовать с нулевым баком.
     * Это будет означать что пассажиры не смогут доехать до леса, чтобы там гулять.
     * Из-за отсутствия обработки исключения, программа аварийно завершит работу.
     */
    private static void ex1() throws Exception {
        System.out.println("Хотим поехать в лес на машине");
        Car car = new Car(0);
        //Машина не заведется и выбросит исключение
        car.start();
        //Данный код не будет выполнен
        System.out.println("гуляем в лесу");
        System.out.println("___________________________________________");
    }

    /**
     * Пример обработки исключения.
     * У нас есть функция converter, которая обрезает строку на одну букву с начала
     * Если вместо текста туда передано null или пустая строка, будет выброшена ошибка
     * Из-за наличия обработки исключения, программа продолжит работу.
     */
    private static void ex2() {
        try {
            System.out.println(converter(null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("программа работает дальше!");
    }

    /**
     * @param text
     */
    private static String converter(String text) throws Exception {
        if (text == null || text.isEmpty()) {
            throw new Exception("");
        }
        return  text.substring(1);
    }
}