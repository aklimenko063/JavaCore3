package org.javaacademy.module1.homework.third.ex1;

public class Runner {
    public static void main(String[] args) {
        Pine pine = new Pine(200, "Большие иголки");
        Spruce spruce = new Spruce(300, "Маленькие иголки");
        Birch birch = new Birch(120, true);
        birch.leavesGrow();
        //Т.к. деревья наследуются от двух абстракных классов,
        //имеет смысл сделать массив Tree[]
        Tree[] treeArray = new Tree[]{pine, spruce, birch};
        //Посчитаем средний возраст деревьев.
        Tree.averageAge(treeArray);
    }
}
