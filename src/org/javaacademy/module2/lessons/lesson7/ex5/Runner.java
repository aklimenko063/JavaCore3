package org.javaacademy.module2.lessons.lesson7.ex5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Терминальные операции (Заканчивают работу со стримом)
        Stream<String> stream = Stream.of("A", "B", "C");
        //Действие с каждым элементом
        stream.forEach(el -> System.out.println(el));

        //Возвращает количество элементов стрима
        long count = Stream.of("A", "B", "C").count();
        System.out.println("Элементов в стриме " + count);

        //Логические операции
        //Хотя бы один элемент соответствует условию
        boolean anyMatch = Stream.of(null, "B", "C").anyMatch(element -> "B".equals(element));

        //Все элементы соответствует условию
        boolean allMatch = Stream.of("A", "B", "C").allMatch(element -> element.length() == 1);

        //Ни один элемент не соответствует условию
        boolean noneMatch = Stream.of("A", "B", "C").noneMatch(el -> el == null);


        //Возвращение одного элемента

        //Возвращение первого элемента
        String text = Stream.of("Бабушка1", "Бабушка2", "Бабушка3")
                .findFirst()
                .orElse("Заглушка");
        System.out.println(text);

        //Возвращение любого элемента
        String text2 = Stream.of("Бабушка1", "Бабушка2", "Бабушка3")
                .findAny()
                .orElse("Заглушка");
        System.out.println("___________________________________________");

        //Минимальное значение
        Integer minValue = Stream.of(50, 100, 200)
                .min((a, b) -> a - b)
                .orElseThrow();
        System.out.println(minValue);

        //Максимальное значение
        Integer maxValue = Stream.of(50, 100, 200)
                .max((a, b) -> a - b)
                .orElseThrow();
        System.out.println(maxValue);

        //Собрать все в одно значение
        Integer summ = Stream.of(50, 100, 200).reduce(1000, (a, b) -> a + b);
        System.out.println(summ);

        //Собрать обратно в коллекцию
        List<Integer> list = Stream.of(50, 100, 200).collect(Collectors.toList());

    }
}
