package org.example.homework.third.ex1;

public abstract class DeciduousTree extends Tree{
    protected boolean thereAreLeavesNow;

    public DeciduousTree(int age, boolean thereAreLeavesNow) {
        super(age);
        this.thereAreLeavesNow = thereAreLeavesNow;
    }

    protected void leavesGrow() {
        if (!thereAreLeavesNow) {
            thereAreLeavesNow = true;
            System.out.println("Дерево цветет. Листья растут.");
        } else {
            System.out.println("Дерево уже расцвело.");
        }
    }

    protected void leavesFall() {
        if (thereAreLeavesNow) {
            thereAreLeavesNow = false;
            System.out.println("Листья опадают.");
        } else {
            System.out.println("На дереве нет листьев.");
        }
    }
}
