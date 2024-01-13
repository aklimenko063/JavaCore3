package org.javaacademy.module1.lessons;

public class Lesson1 {
    public static void main(String[] args) {

        //010101 - двоичный код, байт код. Представление любых данных на языке компьютера.

        //Булево значение (истина/ложь)
        boolean isGoToShop = true; //1
        boolean isNotGoToShop = false; //0

        //Целые числа

        //bit - кусочек, число от 0 до 1

        //byte - состоит из 8 bit
        //2 4 8 16 32 128 256
        //0 - 255
        //-128 - 0 - 127
        byte ipAddressFirst = -128;
        byte ipAddressLast = 127;

        //short - состоит из двух byte
        //16 bit
        //256 * 256 = 65536
        //0 - 65535
        //-32768 - 0 - 32767
        short shortTypeMin = -32768;
        short shortTypeMax = 32767;

        //int - состоит из четырех byte
        //32 bit
        //65536 * 65536 = 4 294 967 296
        //0 - 4 294 967 295
        //-2 147 483 648 - 0 - 2 147 483 647
        int countPeopleChinaMin = -2_147_483_648;
        int countPeopleChinaMax = 2_147_483_647;

        //long - состоит из восьми byte
        //64 bit
        //4 294 967 296 * 4 294 967 296 = 1,844674407370955e+19
        long contPeopleWorld = 8_000_000_000L;


        //Числа с плавающей точкой

        //float - состоит из четырех byte
        //32 bit
        //Нельзя использовать в точных вычислениях
        //Хранит 7 знаков после запятой
        float cola = 0.33F;
        System.out.println(cola - 0.0125);
        float cola1 = 0.12345678901234567890F;
        System.out.println(cola1);

        //double - состоит из восьми byte
        //64 bit
        //Нельзя использовать в точных вычислениях
        //Хранит 16 знаков после запятой
        double atom = 0.12345678901234567890;
        System.out.println(atom);


        //Математические операции
        int apple = 5;
        //Сложение
        apple = 5 + 1;
        //Вычитание
        apple -= 1;
        //Деление
        apple = 8 / 2;
        //8 / 3 = 2.3333333 = 2
        //Умножение
        apple = 2 * 2;
        //Остаток от деления
        apple = 1 % 2;
        //1 % 2 = 0 - 1 = 1
        //33 % 2 = 33 - 32 = 1
        //10 % 3 = 10 - 9 = 1
        //8 % 2 = 8 - 8 = 0


        //char - символ
        //16 bit
        char symbol = 100;
        System.out.println(symbol);
        char symbol2 = 'л';
        System.out.println(symbol2);


        //Непримитивные типы данных

        //String - строки
        //Ссылки хранятся в пуле строк
        String name = "Sqeezer";
        System.out.println(name);
        String name2 = new String("Sqeezer");
        System.out.println(name2);

        //Ссылки строк не равны, это разные объекты в пуле строк
        System.out.println(name == name2);

        //Сравнение значения строк. Значения строк равны.
        System.out.println(name.equals(name2));

        //Тут ссылки будут равны, тк при такой инициализации переменной происходит чтение ссылки из пула строк
        String name3 = "Sqeezer";
        String name4 = "Sqeezer";
        System.out.println(name3 == name4);

        String test = new String("   to The   master... !  ");

        //Перевод в верхний регистр. Создается новая строка.
        System.out.println(test.toUpperCase());
        System.out.println(test == test.toUpperCase());

        //Перевод в нижний регистр. Создается новая строка.
        System.out.println(test.toLowerCase());
        System.out.println(test == test.toLowerCase());

        //Поиск по строке. Возвращает булево
        boolean containsMa = test.contains("ma");
        System.out.println(containsMa);

        //Повторение строки
        String repeat = test.repeat(5);
        System.out.println(repeat);

        //Отсечение символов в строке. Начальный символ и конечный
        String substring1 = new String(name.substring(4, 7));
        System.out.println(substring1);
        String substring2 = new String(name.substring(2));
        System.out.println(substring2);

        //Получение длины строки
        int lenght = name.length();
        System.out.println(lenght);

        //Обрезка пробелов лево и право
        String trim = test.trim();
        System.out.println(trim);

    }
}
