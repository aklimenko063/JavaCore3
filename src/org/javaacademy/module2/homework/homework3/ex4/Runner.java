package org.javaacademy.module2.homework.homework3.ex4;

/**Задание №4: Гори ясно!
Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
любого типа.
Создать с помощью лямбд выражений:
атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!*/
public class Runner {
    public static void main(String[] args) {
        Burning<String> atomReactor = (item) -> {
            if ("Уран".equals(item)) {
                System.out.println("Зеленый свет вокруг!");
            }
        };
        atomReactor.burn("Уран");

        Burning<String> bonfire = (item) -> {
            if ("Дрова".equals(item)) {
                System.out.println("Желто-красный свет вокруг!");
            }
        };
        bonfire.burn("Дрова");
    }
}
