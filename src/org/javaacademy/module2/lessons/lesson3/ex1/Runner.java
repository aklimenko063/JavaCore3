package org.javaacademy.module2.lessons.lesson3.ex1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Runner {
    public static void main(String[] args) {
        //FIFO - First in, first out - первый пришел, первый вышел
        Queue<String> queue = new LinkedList<>();
        queue.add("Бабушка 1");
        queue.add("Бабушка 2");
        String grandBa = queue.element();
        System.out.println(queue);
        System.out.println(grandBa);
        System.out.println("___________________________________________");

        //LIFO - Last in, first out - последний вошел, первый вышел
        Deque<String> deque = new LinkedList<>();
        deque.add("Queen");
        deque.add("9");
        deque.add("King");
        String card = deque.pollLast();
        System.out.println(card);
        System.out.println(deque);
    }
}