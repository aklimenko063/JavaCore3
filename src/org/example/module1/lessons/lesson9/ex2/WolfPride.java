package org.example.module1.lessons.lesson9.ex2;

/**
 * Волчья стая
 */
public class WolfPride {
    private Wolf[] wolves = {
            new Wolf(),
            new Wolf()
    };

    /**
     * Перевод проверяемого исключения(Exception) в RuntimeException
     * У каждого волка есть метод охотиться, который может выбрасывать Exception
     * Если есть в стае ранненый волк, то из-за отсутствия обработки try catch метода prideWolf
     * наша программа упадет.
     * Перевод в RuntimeException сделан для того, чтобы в методах вызывающих prideWolf не обрабатывать
     * ошибку из wolf.hunt() - так как вероятность того что все волки ранены мала.
     */
    public void prideWolf() {
        for (int i = 0; i < wolves.length; i++) {
            try {
                wolves[i].hunt();
            } catch (Exception e) {
                throw new RuntimeException("Среди стаи есть раненый волк", e);
            }
        }
    }

}
