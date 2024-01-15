package org.javaacademy.module2.homework.Homework1.ex2;

import java.util.ArrayList;
import java.util.List;

/**Создать два List с числами
Первый List: 5,2,4
Второй List: 7,10
Создать финальный лист и заполнить его данными из первого и второго листа, не используя for each.
Удалить 3 элемент в финальном листе. Вывести на экран индекс числа 10.*/
public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> integersListOne = new ArrayList<>(List.of(new Integer[]{5, 2, 4}));
        System.out.println("Первый List: " + integersListOne);
        ArrayList<Integer> integersListTwo = new ArrayList<>(List.of(new Integer[]{7, 10}));
        System.out.println("Второй List: " + integersListTwo);

        /**Создаем финальный List и заполняем его данными из integersListOne ArrayList и integersListTwo ArrayList*/
        ArrayList<Integer> finalList = new ArrayList<>();
        finalList.addAll(integersListOne);
        finalList.addAll(integersListTwo);
        System.out.println("Финальный List: " + finalList);

        /**Удаляем третий элемент в финальном List*/
        if (finalList.size() > 2) {
            System.out.println("Сейчас мы удалим третий элемент в финальном List (значение): " + finalList.get(2));
            finalList.remove(2);
            System.out.println("Финальный List после удаления: " + finalList);
        }

        /**Выводим на экран индекс числа 10*/
        int indexOf10 = finalList.indexOf(10);
        System.out.println("Индекс числа 10: " + indexOf10);
    }
}
