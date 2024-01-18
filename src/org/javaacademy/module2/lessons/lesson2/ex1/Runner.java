package org.javaacademy.module2.lessons.lesson2.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Integer[] ints = {6, 6, 2, 3, 4, 5};
        List<Integer> imList = List.of(ints);
        ArrayList<Integer> integers = new ArrayList<>(imList);
        //Добавляем элементы
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        integers.add(5);

        System.out.println("Вывод коллекции:" + integers);
        System.out.println("Соодержится ли 2 и 6:" + integers.containsAll(List.of(2, 6)));
        System.out.println("Удаление 2 и 4:" + integers.removeAll(List.of(4, 2)));
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

        // перенос в массив
        System.out.println("перенос в массив");
        String[] array = strings.toArray(new String[strings.size() - 1]);
        System.out.println(Arrays.toString(array));

        System.out.println("Индекс Х: " + strings.indexOf("X"));
        System.out.println("Индекс Q: " + strings.indexOf("Q"));

        strings.clear();
        System.out.println("Вывод после очистки:" + strings);
        System.out.println(Arrays.toString(array));

        //Неизменяемый лист (не можем удалять, добавлять и изменять элементы)
        List<String> immutableList = List.of("D", "C");
        //будет ошибка
        //immutableList.add("E");


        //["A", "B", "C", "D", null, null ...]
        //[null, null , null , "A", "B", "C", "D"]


    }
}
