package org.javaacademy.module2.lessons.lesson1.ex2;

import org.javaacademy.module2.lessons.lesson1.ex2.input.Input;
import org.javaacademy.module2.lessons.lesson1.ex2.output.Output;

public class Computer <I extends Input, O extends Output> implements Input, Output {
    private I input;
    private O output;

    public Computer(I input, O output) {
        this.input = input;
        this.output = output;
    }

    @Override
    public void inputInformation() {
        input.inputInformation();
    }

    @Override
    public void outputInformation() {
        output.outputInformation();
    }

    public I getInput() {
        return input;
    }

    public O getOutput() {
        return output;
    }
}
