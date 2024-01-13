package org.javaacademy.module2.lessons.lesson1.ex3;

public class Runner {
    public static void main(String[] args) {
        Water water = new Water();
        System.out.println(water.isHasMark());
        Water water1 = Marker.makeMark(water);
        System.out.println(water1.isHasMark());

        Milk milk = new Milk();
        Milk milk1 = Marker.makeMark(milk);
    }
}
