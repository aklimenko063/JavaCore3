package org.example.homework.second.shop;

import java.util.Arrays;

public class Shop {
    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkers() {
        for (Worker worker : workers) {
            System.out.printf("%s: %d лет, %s, список вещей: %s\n",
                    worker.name, worker.age, worker.sex, Arrays.toString(worker.items));
        }
    }

    public void employeeBoasting() {
        for (Worker worker : workers) {
            for (Item item : worker.items) {
                worker.boasting(item);
            }
        }
    }
}