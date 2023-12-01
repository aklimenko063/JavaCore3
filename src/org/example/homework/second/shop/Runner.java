package org.example.homework.second.shop;

public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item("Молот", 1000);
        Item screwdriver = new Item("Отвертка", 50);
        Item notebook = new Item("Тетрадь", 30);
        Item pen = new Item("Ручка", 10);

        Worker vasiliy = new Worker("Василий", 30, "Муж");
        vasiliy.items = new Item[2];
        vasiliy.items[0] = hammer;
        vasiliy.items[1] = screwdriver;

        Worker maryana = new Worker("Марьяна", 25, "Жен");
        maryana.items = new Item[2];
        maryana.items[0] = notebook;
        maryana.items[1] = pen;

        Worker[] workers = new Worker[2];
        workers[0] = vasiliy;
        workers[1] = maryana;
        Shop shop = new Shop(workers);

        shop.printWorkers();
        shop.employeeBoasting();
    }
}