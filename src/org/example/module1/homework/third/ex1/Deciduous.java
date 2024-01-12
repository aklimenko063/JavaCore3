package org.example.homework.third.ex1;

public abstract class Deciduous extends Tree{
    protected boolean hasLeaves;

    public Deciduous(int age, boolean hasLeaves) {
        super(age);
        this.hasLeaves = hasLeaves;
    }

    protected void leavesGrow() {
        if (!hasLeaves) {
            hasLeaves = true;
            System.out.println("Дерево цветет. Листья растут.");
        } else {
            System.out.println("Дерево уже расцвело.");
        }
    }

    protected void leavesFall() {
        if (hasLeaves) {
            hasLeaves = false;
            System.out.println("Листья опадают.");
        } else {
            System.out.println("На дереве нет листьев.");
        }
    }
}
