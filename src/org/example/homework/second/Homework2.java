package org.example.homework.second;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        //Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};

        //Посчитать сумму каждой диагонали используя цикл(ы)
        //Вывесим на экран

        System.out.println("Инициализация ex1");

        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0; //1509
        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0; //1053

        for (int index = 0; index < arrayOfNumbers.length; index++) {
            leftUpToRightDownSum += arrayOfNumbers[index][index];
            leftDownToRightUpSum += arrayOfNumbers[arrayOfNumbers.length - 1 - index][index];
        }
        System.out.println("Сумма чисел в диагонали leftUpToRightDownSum равна: " + leftUpToRightDownSum);
        System.out.println("Сумма чисел в диагонали leftDownToRightUpSum равна: " + leftDownToRightUpSum);
        System.out.print("\n");
    }

    public static void ex2() {
        //Перевернуть массив(без сторонних классов), не создавая новый массив. Вывести на экран.
        //"перевернуть" - значит последние элементы становятся первыми и наоборот.

        System.out.println("Инициализация ex2");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        for (int index= 0; index < numbers.length / 2; index++) {
            int tempVar = numbers[index];
            numbers[index] = numbers[numbers.length - index - 1];
            numbers[numbers.length - index - 1] = tempVar;
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(numbers));
        System.out.print("\n");
    }

    public static void ex3() {
        System.out.println("Инициализация ex3");
        //Дан распределитель случайных чисел
        Random random = new Random(1);
        //Получение случайного числа
        int number = random.nextInt(1000);
        //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.
        //Вывести номер попытки, с которой получилось получить случайным образом число 999.
        int attempt = 0;
        while (number != 999) {
            number = random.nextInt(1000);
            attempt++;
        }
        System.out.printf("Число 999 сгенерировано с %d попытки\n", attempt);
        System.out.print("\n");
    }

    public static void ex4() {
        //Создать пакет shop. Внутри пакета:
        //Создать класс Item (вещь). У вещи есть вес и наименование.
        //Создать класс Worker (работник). У работника есть: имя, возраст, пол(М/Ж), набор вещей.
        //Работник умеет хвастаться своими вещами: брать по очереди вещь, и кричать:
        //{Имя работника}: смотрите какая у меня вещь - {имя вещи}.
        //Создать класс Shop (магазин). У которого есть работники.
        //Магазин умеет печатать своих работников:
        //{Имя работника}: {возраст} лет, {мужчина или женщина}, список вещей: {набор вещей работника}
        //Создать класс Runner. В классе Runner:
        //Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
        //Создать 2 работников:
        //-Василий,30 лет, мужчина, обладатель молота и отвертки.
        //-Марьяна,25 лет, женщина, обладательница тетради и ручки.
        //Создать магазин с работниками выше.
        //Вызвать у магазина печать.
        //Вызвать у каждого работника магазина хвастовство его вещами (достать работника из магазина).

        System.out.println("Инициализация ex4");
        org.example.homework.second.shop.Runner.main(null);
        System.out.print("\n");
    }

    public static void ex5() {
        //Создать пакет office.
        //Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
        //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
        //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
        //Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
        //"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
        //Охранник обладает именем. Просит выдать ему аванс.
        //В офисе есть метод рабочий день:
        //--Босс начинает подгонять менеджера
        //--Менеджер кричит
        //--Охранник просит аванс
        //--Секретарша всех успокаивает, и просит подождать
        //Создать класс Runner, в котором:
        //Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
        //Секретаря.
        //Создать офис
        //Запустить рабочий день в офисе

        System.out.println("Инициализация ex5");
        org.example.homework.second.office.Runner.main(null);
        System.out.print("\n");
    }
}