package org.example.module1.lessons.lesson9.ex1;

public class Detail implements Workable {
    private boolean isBroken = true;


    /**
     * Метод work выкидывает непроверяемое исключение (RuntimeException)
     * Непроверяемое означает отсутствие необходимости обработки исключения на этапе сборки проекта.
     * Это означает, что нам не нужно указывать в сигнатуре метода этот тип ошибок
     * или обрабатывать в try catch.
     * Отличие проверяемых исключений и непроверяемых ТОЛЬКО в обязательности
     * обработки на этапе сборки проекта.
     */
    @Override
    public void work() {
        if (isBroken) {
            throw new RuntimeException("Деталь сломана");
        }
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}