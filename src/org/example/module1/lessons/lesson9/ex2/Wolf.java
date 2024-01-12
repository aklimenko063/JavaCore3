package org.example.module1.lessons.lesson9.ex2;

public class Wolf {
    private boolean isInjured = true;

    /**
     * Волк может охотиться. Если он ранен, вылетит проверяемое исключение.
     */
    public void hunt() throws Exception {
        if (isInjured) {
            throw new Exception("Волк ранен");
        }
        System.out.println("волк охотится");
    }
}