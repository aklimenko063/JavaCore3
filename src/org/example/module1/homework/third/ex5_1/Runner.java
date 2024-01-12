package org.example.homework.third.ex5_1;

public class Runner {
    public static void main(String[] args) {
        House house1 = new House("проспект Победы", 12);
        House house2 = new House("Северное шоссе", 224);
        System.out.println("Исходный дом1: " + house1);
        System.out.println("Исходный дом2: " + house2);
        System.out.println("---------------");

        City samara = new City("Самара", new House[]{house1, house2});
        System.out.println("Город после создания: " + samara);
        System.out.println("---------------");

        //Сначала прочитали массив городов, затем установили новое значение на поле.
        samara.getHouses()[1].setHouseNumber(2500);

        System.out.println("Город после изменения номера дома: " + samara);
    }
}
