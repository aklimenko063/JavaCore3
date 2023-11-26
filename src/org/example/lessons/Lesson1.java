package org.example.lessons;

public class Lesson1 {
    public static void main(String[] args) {
        
        //Булево значение (истина/ложь)
        boolean isGoShop = true; //1
        boolean isNotGoShop = false; //0

        //Целые числа

        //bit - число от 0 до 1
        //byte - состоит из 8 bit
        //2 4 8 16 32 128 256
        // 0 - 255
        //-128 - 0 - 127
        byte ipAddressFirst = -128;

        //short - состоит из двух byte
        //16 bit
        //256 * 256 = 65536
        //0 - 65535
        //-32768 - 0 - 32767
        short shortType = 32767;

        //int - состоит из четырех byte
        //32 bit
        //4 294 967 296
        //-2 147 483 648 - 0 - 2 147 483 647
        int countPeopleChina = 2_147_483_647;

        //long - состоит из 8 byte
        //64 bit
        long contPeopleWorld = 8_000_000_000L;


        //Числа с плавающей точкой
        //float - состоит из 32 bit
        float cola = 0.33F;

        //double
        //64 bit
        double atom = 0.12346579813246789132456798;

        //
        int apple = 5;
        apple = apple + 1;
        apple = apple - 1;
        apple = 8 / 2;
        apple = 2 * 2;
        apple = 1 % 2;

//        System.out.println(apple);

        //char - символ
        //16 bit
        char symbol = 100;
        char symbol2 = 'л';
//        System.out.println(symbol2);

        //String
        String name = "Sqeezer";
        String name2 = new String("Sqeezer");
        System.out.println(name.equals(name2));

        name.repeat(10);
        name.repeat(10);
        name.repeat(5);

    }
}
