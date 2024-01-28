package org.javaacademy.module2.lessons.lesson6.ex3.factory;

import org.javaacademy.module2.lessons.lesson6.ex3.cars.Car;
import org.javaacademy.module2.lessons.lesson6.ex3.cars.Machine;

public class CarFactory implements Factory {
    @Override
    public Machine getMachine() {
        return new Car();
    }
}
