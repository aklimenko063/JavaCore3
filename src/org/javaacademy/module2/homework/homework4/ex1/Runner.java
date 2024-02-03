package org.javaacademy.module2.homework.homework4.ex1;

import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        List<Car> cars1 = Stream
                .iterate(1, i -> i <= 50, i -> i + 1)
                .map(i -> new Car("а0" + String.format("%02d", i) + "ан799"))
                .collect(Collectors.toList());
        System.out.println(cars1);

        List<Car> cars2 = Stream
                .iterate(1, i -> i <= 50, i -> i + 1)
                .map(i -> new Car("к0" + String.format("%02d", i) + "се178"))
                .collect(Collectors.toList());
        System.out.println(cars2);

        String numbersSpecialCars = Stream.concat(cars1.stream(), cars2.stream())
                .filter(car -> car.getLicensePlateNumber().matches(".*04[0-9].*"))
                .map(Car::getLicensePlateNumber)
                .collect(Collectors.joining(", "));

        System.out.println(numbersSpecialCars);
    }
}
