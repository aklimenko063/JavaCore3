package org.javaacademy.module1.lessons.lesson11.ex1;

public class BeautyShop {
    public int cut(boolean isMale) {
        if (!isMale) {
            System.out.println("Стригу женщину");
            return 2000;
        } else {
            System.out.println("Стригу мужчину");
            return 1000;
        }
    }
}
