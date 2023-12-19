package org.example.homework.four.ex1;

import org.example.homework.four.ex1.car.Car;

public class CarWash {
    private final int taxWashBigAuto = 4_000;
    private final int taxWashSmallAuto = 2_000;

    public int washCar(Car car) throws Exception {
        car.setClean(true);
        return calculateTariff(car);
    }

    public int washCar(Car[] cars) {
        int totalCostWork = 0;
        for (Car car : cars) {
            try {
                totalCostWork += washCar(car);
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
        return totalCostWork;
    }

    private int calculateTariff(Car car) {
        if (car.getDimensions().getLength() > 6 ||
                car.getDimensions().getHeight() > 2.5 ||
                car.getDimensions().getWidth() > 2) {
            return taxWashBigAuto;
        }
        return taxWashSmallAuto;
    }
}
