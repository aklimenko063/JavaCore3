package org.javaacademy.module2.lessons.lesson3.ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //ArrayList
        //[el1, el2 ...]
        //size = 0
        // add = size+1;

        long start = System.currentTimeMillis();
        List<Object> objects = new LinkedList<>();
        for (int i = 0; i < 200_000; i++) {
            objects.add(0, i);
        }
        ArrayList<Object> arrayList = new ArrayList<>(objects);
        objects.get(100_000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}