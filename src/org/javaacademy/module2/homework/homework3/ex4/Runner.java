package org.javaacademy.module2.homework.homework3.ex4;

/**Задание №4: Гори ясно!
Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
любого типа.
Создать с помощью лямбд выражений:
атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!*/
public class Runner {
    public static void main(String[] args) {
        Item uran = new Item("Уран");
        Item firewood = new Item("Дрова");

        Burning<Item> burning = (item) -> {
            if ("Уран".equals(item.getName())) {
                System.out.println("Зеленый свет вокруг!");
            } else if ("Дрова".equals(item.getName())) {
                System.out.println("Желто-красный свет вокруг!");
            }
        };
        burning.burn(uran);
        burning.burn(firewood);
    }
}
