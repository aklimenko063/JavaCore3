package org.javaacademy.module2.homework.homework4.ex1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**Задание №1 - Список спец номеров
Создать класс машина. У машины есть номер.
Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
Создать 50 машин с номерами к0[01-50]се178
Соединить машины в единый стрим
Машины, с номерами 04[0-9] - это спец номера (врачи)
оставить только те машины, которые обладают спец номерами
Получить из машин номера
Соединить в единую строку, с разделителем в " ," - самостоятельное изучение
ожидаемый финал
"a040ан1799, a041ан799, ... , k048се178, k049се178"*/
public class Runner {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(000);
        List<Car> plateNumbers1 = Stream.generate(() -> new Car("а"+counter.addAndGet(1)+"ан799"))
                .limit(50)
                .toList();
        List<Car> plateNumbers2 = Stream.generate(() -> new Car("к"+counter.addAndGet(1)+"се799"))
                .limit(50)
                .toList();
        Stream.concat(plateNumbers1.stream(), plateNumbers2.stream()).forEach(e -> System.out.println(e));

    }
}
