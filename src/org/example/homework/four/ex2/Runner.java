package org.example.homework.four.ex2;

import org.example.homework.four.ex2.exceptions.FlyException;

//Задача №2
//1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
// атрибут самолета: countPassengers.
//2. Создать интерфейс, который объединяет эти два класса.
//3. Имплементировать его в двух классах
//4. Реализовать метод летать:
// Для утки:
// Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
// иначе печатать на экран "утка летит"
// Для самолета:
// Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
// Иначе печать "самолет летит"
//5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
//6. Вызвать у них метод летать
// Перехватить исключения: вывести на экран текст
// Ожидание:
// утка летит
// Ошибка: утка ранена
// самолет летит
// Ошибка: пассажиров в самолете меньше 0
public class Runner {
    public static void main(String[] args) {

        Flyable duckIsNotInjured = new Duck(false);
        Flyable duckIsInjured = new Duck(true);
        Flyable airplane = new Airplane(10);
        Flyable airplane2 = new Airplane(-1);

        Flyable[] flyables = {duckIsNotInjured, duckIsInjured, airplane, airplane2};
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
