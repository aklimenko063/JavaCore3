package org.example.homework.third.ex1;

public final class Birch extends DeciduousTree {
    public Birch(int age, boolean thereAreLeavesNow) {
        super(age, thereAreLeavesNow);
    }

    @Override
    public void leavesGrow() {
        super.leavesGrow();
        System.out.println("Очень много аллергенов. Будьте здоровы.");
    }
}
