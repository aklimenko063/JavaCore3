package org.javaacademy.module2.homework.Homework2.ex1;

import java.util.LinkedList;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    /*Разгрузить багаж*/
    public void unloadLuggage(LinkedList<Suitcase> suitcases) {
        System.out.printf("%s: Мужики, кидаю чемодан из рейса %s\n", name, suitcases.getFirst().getFlightNumber());
    }
}
