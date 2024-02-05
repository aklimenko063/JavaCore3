package org.javaacademy.module2.homework.homework4.ex3;

import java.util.Comparator;
import java.util.List;

/**Задание №3 - Небоскребы, небоскребы, а я...
Дано: Небоскреб - имя небоскреба, его высота в метрах.
Необходимо создать небоскребы:
1 Всемирный торговый центр 1 - 541м
2 Шанхайская башня - 632м
3	Бурдж-Халифа - 828м
4 Международный финансовый центр Пинань - 599м
5 Абрадж аль-Бейт - 601м
6 Всемирный центр Лотте - 555м

Занести данный список в List! Дважды положить бурдж халифа в лист.
С помощью стримов:
Убрать дубликаты
(РАЗНЫЕ СТРИМЫ)
Вывести только первые три небоскреба.
Вывести самый высокий небоскреб.
Вывести те небоскребы, которые выше километра.
Если выше нет, то вывести на экран: небоскреба выше километра - нет.*/
public class Runner {
    public static void main(String[] args) {
        List<Skyscraper> skyscrapers = List.of(
                new Skyscraper("Всемирный торговый центр 1", 541),
                new Skyscraper("Шанхайская башня", 632),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Международный финансовый центр Пинань", 599),
                new Skyscraper("Абрадж аль-Бейт", 601),
                new Skyscraper("Всемирный центр Лотте", 555),
                new Skyscraper("Бурдж-Халифа", 828)
        );
        System.out.println(skyscrapers);

        System.out.println("Убрали дубликаты и ограничили количество 3");
        skyscrapers.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Вывели самый высокий небоскреб");
        skyscrapers.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .ifPresent(System.out::println);

        System.out.println("Вывели небоскребы выше 1000м");
        String heightUp1000 = skyscrapers.stream().filter(e -> e.getHeight() > 1000)
                .map(Skyscraper::getName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("Нет небоскребов выше 1000м");
        System.out.println(heightUp1000);
    }
}
