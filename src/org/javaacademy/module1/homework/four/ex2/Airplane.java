package org.javaacademy.module1.homework.four.ex2;

import org.javaacademy.module1.homework.four.ex2.exceptions.FlyException;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
        System.out.println("Самолет летит");
    }
}
