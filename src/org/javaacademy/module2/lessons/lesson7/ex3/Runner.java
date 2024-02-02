package org.javaacademy.module2.lessons.lesson7.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Сравнение for и Stream api
 */
public class Runner {
    public static void main(String[] args) {
        //Даны буквы А В С
        //Необходимо распечатать только те буквы, которые равны B
        List<String> list = List.of("A", "B", "C");

        //Реализация через for
        ArrayList<String> resultList = new ArrayList<>();
        for (String element : list) {
            if ("B".equals(element)) {
                resultList.add(element);
            }
        }
        for (String letter : resultList) {
            System.out.println(letter);
        }
        System.out.println("___________________________________________");

        //Реализация через stream
        list.stream()
                .filter(element -> element.equals("B"))
                .forEach(element -> System.out.println(element));
        System.out.println("___________________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            numbers.add(i);
        }
        //Создание параллельных стримов (разделение стрима на несколько потоков)
        //За счет распараллеливания появляется возможность более быстрого действия
        //Но теряем порядок
        numbers.parallelStream().forEach(integer ->  System.out.println(integer));

    }
}
