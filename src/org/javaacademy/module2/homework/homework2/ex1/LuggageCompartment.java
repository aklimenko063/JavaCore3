package org.javaacademy.module2.homework.homework2.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class LuggageCompartment {
    public final static int MAX_COUNT_WORKERS = 3;
    private Queue<Suitcase> suitcases = new LinkedList<>();
    private Worker[] workers;

    public LuggageCompartment(Worker[] workers) {
        this.workers = workers;
    }

    /*Прилет самолета*/
    public void planeArrival(String flightNumber) {
        int suitcaseQty = 20;
        for (int i = 0; i < suitcaseQty; i++) {
            suitcases.add(new Suitcase(flightNumber));
        }
    }

    /*Разгрузить багажное отделение*/
    public void unloadingLuggage() {
        while (!suitcases.isEmpty()) {
            for (Worker worker : workers) {
                worker.unloadLuggage(suitcases);
            }
        }
    }
}
