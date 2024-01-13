package org.javaacademy.module1.homework.third.ex2;

public class Runner {
    public static void main(String[] args) {
        //Класс айфон15 может содержать модель исключительно айфон
        //Поэтому во избежании ошибок присвоим значение атрибута по умолчанию дальше в конструкторе.
        //С самсунгом тоже самое.
        Iphone15 iphone15 = new Iphone15();
        SamsungGalaxy samsungGalaxy = new SamsungGalaxy();
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.assembleThePhone(iphone15);
        phoneFactory.assembleThePhone(samsungGalaxy);
    }
}
