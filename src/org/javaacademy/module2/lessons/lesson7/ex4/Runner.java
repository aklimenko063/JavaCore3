package org.javaacademy.module2.lessons.lesson7.ex4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Методы создания стримов
        //Вызов метода stream у Коллекций
        ArrayList<String> list = new ArrayList<>();
        list.stream();

        //Метод Stream.Of
        Stream<String> stream = Stream.of("A", "B", "C");

        //AtomicInteger - позволят увеличивать счетчик, не присваивая новое значение
        AtomicInteger counter = new AtomicInteger();
        //Stream.generate - генерация новых элементов
        Stream.generate(() -> counter.addAndGet(1))
                .limit(100)
                .forEach(number -> System.out.println(number));
    }
}
