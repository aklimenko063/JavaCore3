package org.javaacademy.module2.lessons.lesson4.ex2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        //Создание словаря
        Dictionary dictionary = new Dictionary();
        dictionary.add("Item");
        dictionary.add("Cat");
        dictionary.add("Su");
        dictionary.add(null);
        dictionary.add("Ball");
        dictionary.add("ZZZZ");
        System.out.println(dictionary);

        System.out.println("___________________________________________");
        HashMap<String, String> map = new HashMap<>();
        //Вставка в мапу пары: ключ - значение
        map.put("MyKey", "MyValue2");
        map.put("Yuri", "31");
        //Получение из мапы
        String value = map.get("MyKey");

        //Содержит ли ключ
        boolean containsKey = map.containsKey("MyKey");

        //Размер мапы: количество пар ключ значение
        int size = map.size();

        //Очистка мапы
        //map.clear();

        //Поиск значения
        boolean myValue2 = map.containsValue("MyValue2");

        //Получить по ключу или вернуть дефолтное значение
        String orDefault = map.getOrDefault("MyKey5", "default value");

        //Удалить из мапы по ключу
        map.remove("MyKey");

        //Перебор мапы
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey());
            System.out.println("Value:" + entry.getValue());
        }

        //Получить набор ключей
        Set<String> key = map.keySet();

        //Получить набор значений
        Collection<String> values = map.values();
        System.out.println("___________________________________________");

        //Структура школы с помощью мапы
        //Описание учеников внутри класса
        HashMap<String, String> students = new HashMap<>();
        students.put("Molodyko Yuri", "31");
        students.put("Ivanov Yuri", "31");

        //Описание классов внутри школы
        HashMap<String, Map<String, String>> schoolClasses = new HashMap<>();
        schoolClasses.put("10A", students);

        //Описание школ внутри города
        Map<String, Map<String, Map<String, String>>> schools = new HashMap<>();
        schools.put("Школа №3", schoolClasses);
        System.out.println(schools);
        System.out.println("___________________________________________");

        //Мапа в которой внутри value нет четкой параметризации (Object)
        HashMap<String, Object> unCastedMap = new HashMap<>();
        unCastedMap.put("Школа №3", schoolClasses);
        Object o = unCastedMap.get("Школа №3");
        System.out.println(unCastedMap);
    }
}