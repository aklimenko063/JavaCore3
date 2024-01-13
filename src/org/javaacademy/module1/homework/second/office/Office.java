package org.javaacademy.homework.second.office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Security security;
    private Secretary secretary;

    public Office(Boss boss, Manager manager, Security security, Secretary secretary) {
        this.boss = boss;
        this.manager = manager;
        this.security = security;
        this.secretary = secretary;
    }

    public void runWorkDay() {
        boss.speech(manager.getName());
        manager.speech();
        security.speech();
        secretary.speech(boss.getName(), manager.getName(), security.getName());
    }
}