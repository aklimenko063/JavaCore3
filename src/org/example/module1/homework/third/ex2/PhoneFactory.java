package org.example.homework.third.ex2;

import org.example.homework.third.ex2.components.Camera;
import org.example.homework.third.ex2.components.Motherboard;
import org.example.homework.third.ex2.components.OperatingSystem;

public class PhoneFactory {

    public void assembleThePhone(Iphone15 iphone15) {
        iphone15.setMotherboard(new Motherboard("7uik", 15, 12, 13));
        iphone15.setOs(new OperatingSystem("IOS"));
        iphone15.setCamera(new Camera("iphone", 15, true));
        System.out.println(iphone15);
    }

    public void assembleThePhone(SamsungGalaxy samsungGalaxy) {
        samsungGalaxy.setMotherboard(new Motherboard("j-108", 10, 12, 13));
        samsungGalaxy.setOs(new OperatingSystem("Android"));
        samsungGalaxy.setCamera(new Camera("Samsung", 20, false));
        System.out.println(samsungGalaxy);
    }
}
