package org.example.homework.third.ex2.components;

public class OperatingSystem {
    private final String name;

    public OperatingSystem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'" + name + '\'';
    }
}
