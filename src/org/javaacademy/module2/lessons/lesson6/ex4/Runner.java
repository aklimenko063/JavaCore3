package org.javaacademy.module2.lessons.lesson6.ex4;

public class Runner {
    public static void main(String[] args) {
        MathFunction addFunction = (number1, number2) -> number1 + number2;
        MathFunction minusFunction = (number1, number2) -> number1 - number2;
        MathFunction multiplyFunction = (number1, number2) -> number1 * number2;
        MathFunction divideFunction = (number1, number2) -> number1 / number2;
        double result = addFunction.makeOperation(2, 3);
        System.out.println(result);

        Calculator calculator = new Calculator();
        double result2 = calculator.makeOperation(2, 3);
    }
}
