package org.javaacademy.module2.lessons.lesson1.ex2;

import org.javaacademy.module2.lessons.lesson1.ex2.input.Keyboard;
import org.javaacademy.module2.lessons.lesson1.ex2.output.Monitor;

public class AppleComputer extends Computer<Keyboard, Monitor> {
    public AppleComputer(Keyboard input, Monitor output) {
        super(input, output);
    }
}
