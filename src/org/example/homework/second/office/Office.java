package org.example.homework.second.office;

public class Office {
    Boss boss;
    Manager manager;
    Security security;
    Secretary secretary;

    public Office(Boss boss, Manager manager, Security security, Secretary secretary) {
        this.boss = boss;
        this.manager = manager;
        this.security = security;
        this.secretary = secretary;
    }

    public void runWorkDay() {
        boss.speech(manager.name);
        manager.speech();
        security.speech();
        secretary.speech(boss.name, manager.name, security.name);
    }
}
