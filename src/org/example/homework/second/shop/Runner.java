package org.example.homework.second.shop;

public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item("Молот", 1000);
        Item screwdriver = new Item("Отвертка", 50);
        Item notebook = new Item("Тетрадь", 30);
        Item pen = new Item("Ручка", 10);

        Worker vasiliy = new Worker("Василий", 30, "Муж");
        vasiliy.setItems(new Item[]{hammer, screwdriver});

        Worker maryana = new Worker("Марьяна", 25, "Жен");
        maryana.setItems(new Item[]{notebook, pen});

        Worker[] workers = new Worker[]{vasiliy, maryana};
        Shop shop = new Shop(workers);

        shop.printWorkers();
        for (Worker worker : workers) {
            for (Item item : worker.getItems()) {
                worker.boasting(item);
            }
        }
    }
}