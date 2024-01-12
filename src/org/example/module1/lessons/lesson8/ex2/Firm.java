package org.example.module1.lessons.lesson8.ex2;

/**
 * Фирма
 */
public class Firm {
    private Worker worker;

    public Firm(Worker worker) {
        this.worker = worker;
    }

    /**
     * Фирма заработывает деньги благодаря работнику
     * Работник может выбрасывать несколько исключений.
     * Т.к. эти исключения являются наследниками класс Exception,
     * мы можем не перечислять их все в throws, а просто указать Exception как родителя
     */
    public void getMoney() throws Exception {
        worker.work();
        System.out.println("заработали много денег");
    }
}