package org.javaacademy.module2.lessons.lesson5.ex1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        String passportNumber1 = "01A2225";
        String passportNumber2 = "01A2226";
        System.out.println(passportNumber1.hashCode());
        System.out.println(passportNumber2.hashCode());


        HashSet<String> reestr = new HashSet<>();

        //Добавление элементов
        reestr.add(passportNumber1);
        reestr.add(passportNumber2);

        //Есть ли там номер паспорта?
        boolean result = reestr.contains("01A2225");

        //Перебрать все значения
        for (String passportNumber : reestr) {
            System.out.println(passportNumber);
        }
        System.out.println("___________________________________________");

        //Добавление дубликата
        reestr.add(passportNumber1);
        System.out.println(reestr);
        System.out.println("___________________________________________");

        //Удаление дубликатов
        List<String> oldPassport = List.of("B2225", "B2225", "B2226", "B2226");
        reestr.addAll(oldPassport);
        System.out.println(reestr);
        System.out.println("___________________________________________");

        HashSet<String> oldPassportReest = new HashSet<>(oldPassport);
        System.out.println(oldPassportReest);
        System.out.println("___________________________________________");

        Map<String, Integer> map = Map.of("Yuri", 31, "Damir", 35);
        Set<String> names = map.keySet();
        System.out.println(names);
        System.out.println("___________________________________________");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("ключ : %s, значениe: %s\n",  entry.getKey(), entry.getValue() );;
        }


    }
}
