package org.javaacademy.module2.lessons.lesson6.ex9;

import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Item item = new Item(100, 100, 100);
        Item item2 = new Item(200, 200, 200);

        Comparator<Item> itemComparator = (it, it2) -> {
            long volume1 = it.getHeight() * it.getLength() * it.getWidth();
            long volume2 = it2.getHeight() * it2.getLength() * it2.getWidth();
            return Long.compare(volume1, volume2);
        };
        int result = itemComparator.compare(item, item2);
        System.out.println(result);
    }
}
