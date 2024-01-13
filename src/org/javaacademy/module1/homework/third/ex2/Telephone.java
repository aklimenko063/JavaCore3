package org.javaacademy.module1.homework.third.ex2;

import org.javaacademy.module1.homework.third.ex2.components.Camera;
import org.javaacademy.module1.homework.third.ex2.components.Motherboard;
import org.javaacademy.module1.homework.third.ex2.components.OperatingSystem;

public abstract class Telephone {
    protected String modelPhone;
    protected Motherboard motherboard;
    protected OperatingSystem os;
    protected Camera camera;

    public Telephone(String modelPhone) {
        this.modelPhone = modelPhone;
    }

    protected void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    protected void setOs(OperatingSystem os) {
        this.os = os;
    }

    protected void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Телефон: " +
                "модель - '" + modelPhone + '\'' +
                ", материнская плата - " + motherboard +
                ", операционная система - " + os +
                ", камера - " + camera;
    }
}
