package org.javaacademy.module2.lessons.lesson4.ex2;

import java.util.Arrays;

/**
 * Словарь. Схема устройства похожа на hashmap, только без вставки value
 * Т.е. де факто это не МАП!
 */
public class Dictionary {
    Node[] words = new Node[4];

    public void add(String newWord) {
        if (newWord == null) {
            words[0] = new Node(null);
            return;
        }
        int lengthWord = newWord.hashCode();
        int index = (lengthWord % (words.length - 1) + 1);
        if (words[index] == null) {
            words[index] = new Node(newWord);
        } else {
            Node node = words[index];
            while (node.next != null && !newWord.equals(node.key)) {
                node = node.next;
            }
            if (!newWord.equals(node.key)) {
                node.next = new Node(newWord);
            }
        }
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "words=" + Arrays.toString(words) +
                '}';
    }

    public static class Node {
        private String key;
        private Node next = null;

        public Node(String key) {
            this.key = key;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String getKey() {
            return key;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + key + '\'' +
                    ", next=" + next +
                    '}';
        }
    }
}
