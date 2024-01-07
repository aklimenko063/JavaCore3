package org.example.lessons.lesson8.ex2;

import org.example.lessons.lesson8.ex2.exceptions.AxeBrokenException;

/**
 * Топор
 */
public class Axe {
    private boolean isBroken = false;

    public Axe(boolean isBroken) {
        this.isBroken = isBroken;
    }

    /**
     * Топор де-факто уже сломан и выбрасывает исключение
     */
    public void slash() throws AxeBrokenException {
        if (isBroken) {
            throw new AxeBrokenException();
        }
        System.out.println("топор рубит");
    }
}