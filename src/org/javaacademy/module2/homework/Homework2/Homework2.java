package org.javaacademy.module2.homework.Homework2;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        //1. Задание: багажное отделение аэропорта
        //Создать класс чемодан, атрибут: номер рейса

        //Создать класс работник. Имеет имя.
        //Имеет функцию кинуть багаж с криком. На вход набор чемоданов.
        //Работник берет один чемодан из набора чемоданов.
        //Печатает на экран: {имя работника}: Мужики, кидаю чемодан {номер рейса чемодана}

        //Создать класс багажное отделение, атрибуты: набор чемоданов, 3 работника.
        //В классе багажное отделения есть функция: прилет самолета. На вход номер рейса.
        //В багажном отделении добавляются 20 чемоданов из этого рейса.
        //
        //В классе багажное отделение есть функция: разгрузить багажное отделение.
        //3 работника по очереди разгружают вещи, в том порядке, в котором происходили прилеты.

        //Создать раннер, в нем багажное отделение. Организовать два прилета SU-077, AO-222.
        //Разгрузить багажное отделение. Сначала должны выйти чемоданы su-077, потом ao-222.

        //2. Задание: Вещей много, бакет один
        //Создать класс Item, атрибут - name
        //Переопределить у Item equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
        //вещи всегда попадали в один и тот же bucket.
        //При добавлении вещей, они не должны замещать друг друга.
        //Пример: создал 3 вещи: item(Яблоко), item(Банан), item(Апельсин)
        // положил в Map(ключ - значение):
        // item(Яблоко) - 1
        // item(Банан) - 2
        // item(Апельсин) - 3
        //При получении значения по ключу item(Апельсин) получу корректное значение (3)

        //3. Задание: Сломай это немедленно
        //Создать класс Detail, атрибут - name
        //Переопределить у Item equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
        //деталь всегда перетирала имеющуюся там деталь.
        // Т.е. если положить Hashmap 3 детали в качестве ключа (число значение):
        // detail(Пила) - 1, detail(Молоток) - 2, detail(отвертка) - 3
        //При попытке печати map на экран: там будет последняя вставленная деталь ( detail(отвертка) )
    }
}
