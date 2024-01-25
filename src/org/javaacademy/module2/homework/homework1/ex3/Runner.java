package org.javaacademy.module2.homework.homework1.ex3;

import java.util.List;

/**Создать класс Item - с единственным атрибутом - имя вещи.
Склад принимает в себя вещи. У склада нет ограничений в хранении.
Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
В складе должен быть метод: получить все вещи. Данный метод вернет список, в котором будет только каждая четная вещь из склада.
В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
Склад умеет удалять все вещи, кроме последней.*/
public class Runner {
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addItems(List.of(
                new Item("Отвертка"),
                new Item("Топор"),
                new Item("Плоскогубцы")
        ));
        storage.addItems(List.of(
                new Item("Шуруповерт"),
                new Item("Дрель"),
                new Item("Зубило")
        ));

        storage.printIvenItem();

        System.out.println("Список вещей перед поиском и удалением: " + storage.getItems());
        int searchIndex = 2;
        System.out.println("Найденная вещь по индексу " + searchIndex + " : " +
                storage.getItemByIndex(searchIndex));
        System.out.println("Список вещей после удаление искомой вещи: " + storage.getItems());

        storage.deleteEverythingExceptTheLastOne();
        System.out.println("Список вещей после удаление всех вещей кроме последней: " + storage.getItems());
    }
}
