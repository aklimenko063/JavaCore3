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
        Human seroja = new Human(185.6, 31, "Серожа");

        Divination<Human> chamomile = human -> human.getName().length() % 2 == 0;
        System.out.println(chamomile.answer(seroja));

        Divination<Human> fortuneTeller = (human) -> {
            if ((human.getAge() + human.getHeight()) > 210) {
                return true;
            }
            return false;
        };
        System.out.println(fortuneTeller.answer(seroja));
    }

}
