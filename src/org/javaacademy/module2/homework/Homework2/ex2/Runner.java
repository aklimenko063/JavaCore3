package org.javaacademy.module2.homework.Homework2.ex2;

import java.util.HashMap;

/**2. Задание: Вещей много, бакет один
Создать класс Item, атрибут - name
Переопределить у Item equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
вещи всегда попадали в один и тот же bucket.
При добавлении вещей, они не должны замещать друг друга.
Пример: создал 3 вещи: item(Яблоко), item(Банан), item(Апельсин)
 положил в Map(ключ - значение):
 item(Яблоко) - 1
 item(Банан) - 2
 item(Апельсин) - 3
При получении значения по ключу item(Апельсин) получу корректное значение (3)*/
public class Runner {
    public static void main(String[] args) {
        HashMap<Item, Integer> itemIntegerHashMap = new HashMap<>();
        itemIntegerHashMap.put(new Item("Яблоко"), 1);
        itemIntegerHashMap.put(new Item("Банан"), 2);
        itemIntegerHashMap.put(new Item("Апельсин"), 3);

        System.out.println(itemIntegerHashMap);
        System.out.println(itemIntegerHashMap.get(new Item("Апельсин")));
    }
}
