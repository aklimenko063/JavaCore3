package org.javaacademy.module2.lessons.lesson3.ex3;

public class MyLinkedList<E> {
    private Node<E> firstElement;
    private Node<E> lastElement;

    public void add(E element) {
        if (firstElement == null) {
            this.firstElement = new Node<>(element);
            this.lastElement = firstElement;
        } else {
            Node<E> nextElement = new Node<>(element);
            this.lastElement.next = nextElement;
            this.lastElement = nextElement;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "element1=" + firstElement +
                '}';
    }

    public static class Node<E> {
        private E value;
        private Node<E> next = null;

        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}