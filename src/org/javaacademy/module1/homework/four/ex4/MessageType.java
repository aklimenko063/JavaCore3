package org.javaacademy.module1.homework.four.ex4;

public enum MessageType {
    INCOMING("Входящее"), OUTGOING("Исходящее");

    final String type;

    MessageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
