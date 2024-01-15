package org.javaacademy.module2.homework.Homework1.ex1.zoo;

import java.util.ArrayList;

public class ZooRight <A extends Animal> {
    private ArrayList<A> zoo = new ArrayList<>();

    public ArrayList<A> getZoo() {
        return zoo;
    }
}
