package org.javaacademy.module1.lessons.lesson11.ex2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        Tarificator tarificator = new Tarificator();
//        int tariff = tarificator.getTariff(City.MOSCOW);
//        System.out.println(tariff);
//
//        int tariff1 = tarificator.getTariff(CityE.MOSCOW);
//        System.out.println(tariff1);

        CityE moscow = CityE.valueOf("MOSCOW");
        System.out.println(moscow);

        CityE[] cities = CityE.values();
        System.out.println(Arrays.toString(cities));
    }
}
