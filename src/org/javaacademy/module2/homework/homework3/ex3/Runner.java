package org.javaacademy.module2.homework.homework3.ex3;

/**Задание №3: Поиск пары с помощью гадания
Создать функциональный гадание, который на вход принимает аргумент любого типа,
на выход возвращает да/нет.
Создать с помощью лямбд выражений:
ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
бабку гадалку: принимает Человека(возраст,рост),
возвращает да - если возраст + рост больше 210, нет - если меньше или равно*/
public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = flowerName -> {
            if (flowerName.length() % 2 == 0) {
                return true;
            }
            return false;
        };
        System.out.println(chamomile.answer("Ромашка"));
        System.out.println(chamomile.answer("Роза"));

        Divination<Human> fortuneTeller = (human) -> {
            if ((human.getAge() + human.getHeight()) > 210) {
                return true;
            }
            return false;
        };
        System.out.println(fortuneTeller.answer(new Human(185.6, 31)));
        System.out.println(fortuneTeller.answer(new Human(155.0, 31)));
    }

}
