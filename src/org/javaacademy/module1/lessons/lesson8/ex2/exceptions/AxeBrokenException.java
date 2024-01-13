package org.javaacademy.module1.lessons.lesson8.ex2.exceptions;

/**
 * Созданный нами класс AxeBrokenException позволяет конкретизировать ошибку.
 * Т.е когда вылетит данная ошибка, мы сможем по классу ошибки понять в чем проблема.
 */
public class AxeBrokenException extends Exception {
    public AxeBrokenException() {
        super("Топор сломан");
    }

}