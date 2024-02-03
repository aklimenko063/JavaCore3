package org.javaacademy.module2.homework.homework4.ex2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**Задание №2 - Сколько здесь "о" ?
Создать набор уникальных слов: "тонь", "тополь", "боль", "рой", "стройка"
Внутри одного стрима:
Посчитать количество букв "о" в одном слове
Посчитать сумму количества букв "о" во всех словах из набора
Если буквы "о" есть - напечатать количество букв "о", если нет выкинуть исключение
ожидаемый результат:
 6*/
public class Runner {
    public static void main(String[] args) {
        List<String> listString = List.of("тонь", "тополь", "боль", "рой", "стройка");
        Long numberOfOccurrences = listString.stream()
                .map(word -> word.chars().filter(symbol -> "о".equals(Character.toString(symbol))).count())
                .reduce((a, b) -> a + b)
                .filter(e -> e != 0)
                .orElseThrow(() -> new RuntimeException("Нет вхождений буквы О в перечне"));
        System.out.println(numberOfOccurrences);
    }
}
