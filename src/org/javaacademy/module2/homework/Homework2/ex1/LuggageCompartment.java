package org.javaacademy.module2.homework.Homework2.ex1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LuggageCompartment {
    private LinkedList<Suitcase> suitcases = new LinkedList<>();
    private ArrayList<Worker> workers;

    public LuggageCompartment(ArrayList<Worker> workers) {
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
        while (suitcases.size() != 0) {
            for (Worker worker : workers) {
                if (suitcases.size() == 0) {
                    break;
                }
                worker.unloadLuggage(suitcases);
                suitcases.removeFirst();
            }
        }
    }
}
