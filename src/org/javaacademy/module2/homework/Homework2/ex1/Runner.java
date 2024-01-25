package org.javaacademy.module2.homework.Homework2.ex1;

import static org.javaacademy.module2.homework.Homework2.ex1.LuggageCompartment.MAX_COUNT_WORKERS;

/**1. Задание: багажное отделение аэропорта
Создать класс чемодан, атрибут: номер рейса

Создать класс работник. Имеет имя.
Имеет функцию кинуть багаж с криком. На вход набор чемоданов.
Работник берет один чемодан из набора чемоданов.
Печатает на экран: {имя работника}: Мужики, кидаю чемодан {номер рейса чемодана}

Создать класс багажное отделение, атрибуты: набор чемоданов, 3 работника.
В классе багажное отделения есть функция: прилет самолета. На вход номер рейса.
В багажном отделении добавляются 20 чемоданов из этого рейса.

В классе багажное отделение есть функция: разгрузить багажное отделение.
3 работника по очереди разгружают вещи, в том порядке, в котором происходили прилеты.

Создать раннер, в нем багажное отделение. Организовать два прилета SU-077, AO-222.
Разгрузить багажное отделение. Сначала должны выйти чемоданы su-077, потом ao-222.*/
public class Runner {
    public static void main(String[] args) {
        Worker[] workers = new Worker[MAX_COUNT_WORKERS];
        workers[0] = new Worker("Дима");
        workers[1] = new Worker("Ваня");
        workers[2] = new Worker("Петр");

        LuggageCompartment luggageCompartment = new LuggageCompartment(workers);
        luggageCompartment.planeArrival("SU-077");
        luggageCompartment.planeArrival("AO-222");
        luggageCompartment.unloadingLuggage();
    }
}
