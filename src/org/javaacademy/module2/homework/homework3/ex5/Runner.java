package org.javaacademy.module2.homework.homework3.ex5;

/**Задание №5: универсальная линейка
Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
Создать с помощью лямбд выражений:
Измеритель лодок: на вход лодка(длина), возвращает длину лодки
Измеритель животных: на вход животное(длина тела, длина хвоста),
возвращает сумму длин тела и хвоста*/
public class Runner {
    public static void main(String[] args) {
        Scaler<Boat> boatScaler = boat -> boat.getLength();
        System.out.println(boatScaler.scale(new Boat(175)));

        Scaler<Animal> animalScaler = animal -> animal.getBodyLength() + animal.getTailLength();
        System.out.println(animalScaler.scale(new Animal(35, 15)));
    }
}
