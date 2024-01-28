package org.javaacademy.module2.lessons.lesson6.ex3.factory;

import org.javaacademy.module2.lessons.lesson6.ex3.cars.Machine;
import org.javaacademy.module2.lessons.lesson6.ex3.cars.Truck;

public class TruckFactory implements Factory {
    @Override
    public Machine getMachine() {
        return new Truck();
    }
}
