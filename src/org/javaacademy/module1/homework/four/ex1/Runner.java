package org.javaacademy.module1.homework.four.ex1;

import org.javaacademy.module1.homework.four.ex1.car.Bus;
import org.javaacademy.module1.homework.four.ex1.car.Car;
import org.javaacademy.module1.homework.four.ex1.car.Dimensions;
import org.javaacademy.module1.homework.four.ex1.car.PassengerCar;

//Создать легковую машину (атрибуты: чистая/грязная, размеры(ширина,высота,длина), наличие круиз контроля)
//Создать автобус (атрибуты: чистый/грязный, размеры(ширина,высота,длина), макс количество пассажиров)
//Создать автомойку
//Автомойка умеет мыть машину. Делает машину чистой. Возвращает стоимость помывки.
//Автомойка умеет мыть машины. Делает машины чистыми. Возвращает стоимость помывки за все машины.
//Категории автомобилей:
//если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
//иначе считается маломерной.
//тариф 4000 - для крупных авто.
//тариф 2000 - для маломерных.
//В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
//5 автобусов(12х3х2.3)
//Посчитать, сколько мэрия заплатит денег за мойку машин.
public class Runner {
    public static void main(String[] args) {

        Dimensions passCarDimensions = new Dimensions(2.0, 5.0, 1.8);
        Dimensions busDimensions = new Dimensions(3.0, 12.0, 2.3);

        PassengerCar passengerCar1 = new PassengerCar(false, passCarDimensions);
        PassengerCar passengerCar2 = new PassengerCar(false, passCarDimensions);
        PassengerCar passengerCar3 = new PassengerCar(false, passCarDimensions);
        PassengerCar passengerCar4 = new PassengerCar(false, passCarDimensions);
        Bus bus1 = new Bus(false, busDimensions);
        Bus bus2 = new Bus(false, busDimensions);
        Bus bus3 = new Bus(false, busDimensions);
        Bus bus4 = new Bus(false, busDimensions);
        Bus bus5 = new Bus(false, busDimensions);

        CarWash carWash = new CarWash();
        Car[] cars = {passengerCar1, passengerCar2, passengerCar3, passengerCar4, bus1, bus2, bus3, bus4, bus5};
        int cost = carWash.washCar(cars);
        System.out.println("Стоимость мойки всех машин: " + cost);
    }
}
