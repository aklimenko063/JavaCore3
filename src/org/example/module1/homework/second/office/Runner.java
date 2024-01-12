package org.example.homework.second.office;

public class Runner {
    public static void main(String[] args) {

        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary();

        Office firma = new Office(boss, manager, security, secretary);
        firma.runWorkDay();
    }
}
