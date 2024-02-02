package org.javaacademy.module2.homework.homework3.ex2;

/**Задание №2: Сад
Создать два фрукта: яблоко, абрикос. (Без полей)
Создать функциональный интерфейс сад, который умеет выращивать фрукты.
Метод ничего не принимает.
Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
Яблочная ферма должна отдавать яблоки(не фрукты!), абрикосовая абрикосы(не фрукты!).*/
public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleFarm = () -> new Apple();
        Garden<Peach> peachFarm = () -> new Peach();

        Apple apple = appleFarm.cultivation();
        Peach peach = peachFarm.cultivation();
        System.out.println(apple);
        System.out.println(peach);
    }
}
