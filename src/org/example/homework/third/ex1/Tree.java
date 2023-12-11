package org.example.homework.third.ex1;

public abstract class Tree {
    protected int age;

    public Tree(int age) {
        this.age = age;
    }

    public static void averageAge(Tree[] treeArray) {
        int totalAge = 0;
        double countTree = treeArray.length;
        double averageAge;
        for (Tree tree : treeArray) {
            totalAge += tree.age;
        }
        averageAge = totalAge / countTree;
        System.out.println("Средний возраст деревьев: " + averageAge + " лет.");
    }
}
