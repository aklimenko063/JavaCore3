package org.example.homework.third.ex1;

public abstract class ConiferTree extends Tree {
    protected String needleType;

    public ConiferTree(int age, String needleType) {
        super(age);
        this.needleType = needleType;
    }
}
