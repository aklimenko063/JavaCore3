package org.javaacademy.module2.homework.Homework2.ex2;

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

    }
}
