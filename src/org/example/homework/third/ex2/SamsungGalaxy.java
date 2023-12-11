package org.example.homework.third.ex2;

import org.example.homework.third.ex2.components.Camera;
import org.example.homework.third.ex2.components.Motherboard;
import org.example.homework.third.ex2.components.OperatingSystem;

public final class SamsungGalaxy extends Telephone {
    public SamsungGalaxy() {
        super("Samsung Galaxy");
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
