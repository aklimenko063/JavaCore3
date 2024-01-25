package org.javaacademy.module2.homework.Homework2.ex3;

import java.util.HashMap;

/**3. Задание: Сломай это немедленно
Создать класс Detail, атрибут - name
Переопределить у Detail equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
деталь всегда перетирала имеющуюся там деталь.
 Т.е. если положить Hashmap 3 детали в качестве ключа (число значение):
 detail(Пила) - 1, detail(Молоток) - 2, detail(отвертка) - 3
При попытке печати map на экран: там будет последнее вставленное значение у первой детали
деталь ( detail(Пила) - 3 )*/
public class Runner {
    public static void main(String[] args) {
        HashMap<Detail, Integer> details = new HashMap<>();
        details.put(new Detail("Пила"), 1);
        details.put(new Detail("Молоток"), 2);
        details.put(new Detail("Отвертка"), 3);

        System.out.println(details);
    }
}
