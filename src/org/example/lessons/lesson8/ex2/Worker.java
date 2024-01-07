package org.example.lessons.lesson8.ex2;

import org.example.lessons.lesson8.ex2.exceptions.AxeBrokenException;
import org.example.lessons.lesson8.ex2.exceptions.WorkerWithoutAxeException;

/**
 * Работник
 */
public class Worker {
    private Axe axe;

    public Worker(Axe axe) {
        this.axe = axe;
    }

    /**
     * Работник потенциально может выбросить два вида исключений
     * 1 - WorkerWithoutAxeException - если у работника нет топора
     * 2 - AxeBrokenException - если топор сломан
     */
    public void work() throws AxeBrokenException, WorkerWithoutAxeException {
        if (axe == null) {
            throw new WorkerWithoutAxeException("У работника топора");
        }
        //из этого метода может вылететь Exception
        axe.slash();
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }
}