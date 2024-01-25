package org.javaacademy.module2.homework.homework1.ex3;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItems(List<Item> itemsList) {
        items.addAll(itemsList);
        System.out.println("Список вещей на складе: " + items);
    }

    public void printIvenItem() {
        System.out.println("Возвращаем список каждой четной вещи на складе. Итак приступим...");
        for (int i = 1; i <= items.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(items.get(i - 1));
            }
        }
    }

    public Item getItemByIndex(int index) {
        Item indexItem = items.get(index);
        items.remove(indexItem);
        return indexItem;
    }

    public void deleteEverythingExceptTheLastOne() {
        if (items.size() > 1) {
            items.subList(0, items.size() - 1).clear();
        }
    }
}
