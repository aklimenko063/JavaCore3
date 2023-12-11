package org.example.homework.third.ex2;

import org.example.homework.third.ex2.components.Camera;
import org.example.homework.third.ex2.components.Motherboard;
import org.example.homework.third.ex2.components.OperatingSystem;

public class PhoneFactory {

    public void assembleThePhone(Iphone15 iphone15) {
        iphone15.motherboard = new Motherboard("7uik", 15, 12, 13);
        iphone15.os = new OperatingSystem("IOS");
        iphone15.camera = new Camera("iphone", 15, true);
        System.out.println(iphone15);
    }

    public void assembleThePhone(SamsungGalaxy samsungGalaxy) {
        samsungGalaxy.motherboard = new Motherboard("j-108", 10, 12, 13);
        samsungGalaxy.os = new OperatingSystem("Android");
        samsungGalaxy.camera = new Camera("Samsung", 20, false);
        System.out.println(samsungGalaxy);
    }
}
