package org.javaacademy.module1.lessons.lesson8.ex2;

import org.javaacademy.module1.lessons.lesson8.ex2.exceptions.AxeBrokenException;
import org.javaacademy.module1.lessons.lesson8.ex2.exceptions.WorkerWithoutAxeException;

public class Runner {
    /**
     * Пример создания своих Exception и пробрасывания их через классы
     */
    public static void main(String[] args) throws Exception {
        ex1();
        System.out.println("___________________________________________");
        ex2();
    }

    private static void ex1() throws Exception {
        //Создаем топор, но не передаем работнику
        Axe axe = new Axe(false);
        //Создаем работника без топора
        Worker worker = new Worker(null);
        //Создаем фирму с работником
        Firm firm = new Firm(worker);
        try {
            //Пытаемся заработать деньги за счет работы работника
            firm.getMoney();
            //т.к. у работника нет топора, вылетит исключение
        } catch (WorkerWithoutAxeException e) {
            //печатаем путь ошибки
            e.printStackTrace();
            //выдадим работнику новый топор
            worker.setAxe(axe);
            //Пробуем еще раз заработать деньги
            firm.getMoney();
        }
    }

    /**
     * Пример со сломанным топором
     */
    private static void ex2() throws Exception {
        //Создаем сломанный топор
        Axe axe = new Axe(true);
        //Создаем работника со сломанным топором
        Worker worker = new Worker(null);
        //Создаем фирму с работником
        Firm firm = new Firm(worker);
        try {
            firm.getMoney();
        } catch (AxeBrokenException e) {
            System.out.println("Выдаем новый топор");
            Axe goodAxe = new Axe(false);
            worker.setAxe(goodAxe);
            firm.getMoney();
        }
    }
}