package org.javaacademy.module1.homework.third.ex1;

public abstract class Conifer extends Tree {
    protected String needleType;

    public Conifer(int age, String needleType) {
        super(age);
        this.needleType = needleType;
    }
}
