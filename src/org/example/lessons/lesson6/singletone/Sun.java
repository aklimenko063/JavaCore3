package org.example.lessons.lesson6.singletone;

public class Sun {
    private static Sun sun = null;

    private Sun() {
        System.out.println("Солнце создано");
    }

    public static Sun getOrCreateSun() {
        if (sun != null) {
            return sun;
        }
        sun = new Sun();
        return sun;
    }

}