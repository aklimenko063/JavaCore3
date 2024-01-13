package org.javaacademy.module1.homework.third.ex2;

import org.javaacademy.module1.homework.third.ex2.components.Camera;
import org.javaacademy.module1.homework.third.ex2.components.Motherboard;
import org.javaacademy.module1.homework.third.ex2.components.OperatingSystem;

public final class Iphone15 extends Telephone {
    public Iphone15() {
        super("Iphone 15");
    }

    @Override
    protected void setMotherboard(Motherboard motherboard) {
        super.setMotherboard(motherboard);
    }

    @Override
    protected void setOs(OperatingSystem os) {
        super.setOs(os);
    }

    @Override
    protected void setCamera(Camera camera) {
        super.setCamera(camera);
    }
}
