package org.javaacademy.module1.homework.third.ex1;

public final class Birch extends Deciduous {
    public Birch(int age, boolean hasLeaves) {
        super(age, hasLeaves);
    }

    @Override
    public void leavesGrow() {
        super.leavesGrow();
        System.out.println("Очень много аллергенов. Будьте здоровы.");
    }
}
