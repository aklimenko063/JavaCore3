package org.javaacademy.module2.lessons.lesson6.ex4;

public class Calculator implements MathFunction {
    @Override
    public double makeOperation(double number1, double number2) {
        return number1 + number2;
    }
}
