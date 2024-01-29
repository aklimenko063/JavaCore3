package org.javaacademy.module2.lessons.lesson6.ex3;

import org.javaacademy.module2.lessons.lesson6.ex3.cars.Car;
import org.javaacademy.module2.lessons.lesson6.ex3.cars.Machine;
import org.javaacademy.module2.lessons.lesson6.ex3.cars.Moto;
import org.javaacademy.module2.lessons.lesson6.ex3.cars.Truck;
import org.javaacademy.module2.lessons.lesson6.ex3.factory.Factory;

public class Runner {
    public static void main(String[] args) {
        Factory carFactory2 = () -> new Car();

        Factory carFactory = () -> new Car();
        Factory motoFactory = () -> new Moto();
        Factory truckFactory = () -> new Truck();

        Factory factory = new Factory() {
            @Override
            public Machine getMachine() {
                return null;
            }
        };

        Machine machine = truckFactory.getMachine();
        Machine machine2 = motoFactory.getMachine();
        Machine machine3 = carFactory.getMachine();
    }
}
