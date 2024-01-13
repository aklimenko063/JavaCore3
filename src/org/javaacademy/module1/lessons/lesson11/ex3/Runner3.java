package org.javaacademy.module1.lessons.lesson11.ex3;

public class Runner3 {
    public static void main(String[] args) {
        Camry camry = new Camry();
        Solara solara = new Solara();
        Corolla corolla = new Corolla();
        Car[] cars = {camry, solara, corolla};
        for (Car car : cars) {
            System.out.println(car.getTransmission());
        }

    }
}
