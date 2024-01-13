package org.javaacademy.module2.lessons.lesson1.ex3;

public class Marker {
    public static <T extends Product> T makeMark(T product) {
        product.setHasMark(true);
        return product;
    }

    public static Milk makeMarkMilk(Milk milk) {
        milk.setHasMark(true);
        return milk;
    }

    public static Water makeMarkWater(Water water) {
        water.setHasMark(true);
        return water;
    }
}
