package org.javaacademy.module2.homework.Homework2.ex1;

import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    /*Разгрузить багаж*/
    public void unloadLuggage(Queue<Suitcase> suitcases) {
        if (suitcases.isEmpty()) {
            return;
        }
        Suitcase removedSuitcase = suitcases.poll();
        System.out.printf("%s: Мужики, кидаю чемодан из рейса %s\n", name, removedSuitcase.getFlightNumber());
    }
}
