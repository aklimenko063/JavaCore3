package org.javaacademy.module2.lessons.lesson7.ex2;

import java.util.function.Consumer;

/**
 * Пример использования функций высшего порядка.
 * Центр обзвона клиентов.
 */
public class Runner {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        String depositText = "Хотим предложить вам депозит на особых условиях!";
        //Действия оператора Арины
        Consumer<String> arina = (text) -> System.out.println("Здравствуйте, это Арина! " + text);
        //Действия оператора Марины
        Consumer<String> marina = (text) -> System.out.println("Здравствуйте, это Марина! " + text);
        //Звонок №1
        callCenter.call(arina, depositText);
        //Звонок №2
        callCenter.call(marina, depositText);
    }
}
