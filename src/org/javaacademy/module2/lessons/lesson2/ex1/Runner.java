package org.javaacademy.module2.lessons.lesson2.ex1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Integer[] ints = {6, 6, 2, 3, 4, 5};
        List<Integer> imList = List.of(ints);
        ArrayList<Integer> integers = new ArrayList<Integer>(imList);
        //Добавляем элементы
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        integers.add(5);

        System.out.println("Вывод коллекции:" + integers);
        System.out.printf("Содержит 10: %s\n", integers.contains(10));
        integers.remove(new Integer(6));
        System.out.println("Вывод после удаления:" + integers);
        integers.set(2, 13);
        System.out.println("Вывод после изменения элемента:" + integers);

        ArrayList<String> strings = new ArrayList<>(List.of("A", "B", "C", "D"));
        System.out.println("Вывод коллекции:" + strings);
        strings.add(2, "E");
        System.out.println(strings);
        strings.addAll(0, List.of("X", "Y", "Z"));
        System.out.println("Вывод коллекции после добавления другой коллекции:" + strings);
        System.out.println("Индекс Х: " + strings.indexOf("X"));

        strings.clear();
        System.out.println("Вывод после очистки:" + strings);
        //Неизменяемый лист (не можем удалять, добавлять и изменять элементы)
        List<String> immutableList = List.of("D", "C");
        //будет ошибка
        //immutableList.add("E");


        //["A", "B", "C", "D", null, null ...]
        //[null, null , null , null , "A", "B", "C", "D"]

    }
}
