package org.javaacademy.module2.homework.Homework2.ex1;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    /*Разгрузить багаж*/
    public void unloadLuggage(Queue<Suitcase> suitcases) {
//        if (suitcases.isEmpty()) {
//            return;
//        }
        try {
            Suitcase removeSuitcase = suitcases.remove();
            System.out.printf("%s: Мужики, кидаю чемодан из рейса %s\n", name, removeSuitcase.getFlightNumber());
        } catch (NoSuchElementException e) {
            System.out.println("Вещи закончились! Курим бамбук!");
        }
//        Suitcase remove = suitcases.remove();
//        System.out.printf("%s: Мужики, кидаю чемодан из рейса %s\n", name, suitcases.getFirst().getFlightNumber());
    }
}
