package org.javaacademy.module2.lessons.lesson3.ex3;

public class Runner {
    public static void main(String[] args) {
        //{el = null}
        MyLinkedList<String> list = new MyLinkedList<>();
        //{el = Node{value = Бабушка 1, next = null }}
        list.add("Бабушка 1");

        //{el = Node{value = Бабушка 1, next = Node{value = Бабушка 2, next = null} }}
        list.add("Бабушка 2");
        //{el = Node{value = Бабушка 1, next = Node{value = Бабушка 2, next = null} }}
        list.add("Бабушка 3");
        System.out.println(list);
    }
}
