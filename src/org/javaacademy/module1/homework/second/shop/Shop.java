package org.javaacademy.module1.homework.second.shop;

import java.util.Arrays;

public class Shop {
    private Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkers() {
        for (Worker worker : workers) {
            System.out.printf("%s: %d лет, %s, список вещей: %s\n",
                    worker.getName(), worker.getAge(), worker.getSex(), Arrays.toString(worker.getItems()));
        }
    }
}