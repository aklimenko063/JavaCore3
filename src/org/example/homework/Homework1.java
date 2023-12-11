package org.example.homework;

import static org.example.homework.Product.*;
import static org.example.homework.TaxRates.*;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex4_1();
    }

    public static void ex1() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}

        String nameTrimUpper = name.trim().toUpperCase();
        String endingWoman = "ова ";
        String endingMan = "ов ";
        String appeal = "Неизвестное лицо  ";

        if (nameTrimUpper.contains(endingWoman.toUpperCase())) {
            appeal = "Уважаемая ";
        } else if (nameTrimUpper.contains(endingMan.toUpperCase())) {
            appeal = "Уважаемый ";
        }

        System.out.println(appeal.toUpperCase() + nameTrimUpper);

    }

    public static void ex2() {
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (!(fuel < 10) && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4) && !hasErrors && isEngineWork) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }

    }

    public static void ex3() {
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";

        String replacedSimply = simply.toLowerCase().replaceAll("this is", "those are");
        int indexCharO = replacedSimply.indexOf("o", replacedSimply.indexOf("o") + 1 );
        System.out.println(indexCharO);

    }

    public static void ex4() {
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг

        int sellingPriceSausage = 800;
        int productionCostLessThan1000Sausage = 412;
        int productionCostFrom1000to2000Sausage = 408;
        int productionCostMoreThan2000Sausage = 404;
        int quantitySausage = 2000;

        int sellingPriceHam = 350;
        int productionCostHam = 275;
        int quantityHam = 8511;

        int sellingPriceNeck = 500;
        int productionCostLessThan500Neck = 311;
        int productionCostMoreThan500Neck = 299;
        int quantityNeck = 6988;

        int overheads = 1_000_000;

        int incomeSausage = sellingPriceSausage * quantitySausage;
        int incomeHam = sellingPriceHam * quantityHam;
        int incomeNeck = sellingPriceNeck * quantityNeck;
        int incomeAll = incomeSausage + incomeHam + incomeNeck;

        int costOfSausage = 0;
        if (quantitySausage < 1000) {
            costOfSausage = productionCostLessThan1000Sausage * quantitySausage;
        } else if (quantitySausage >= 1000 && quantitySausage < 2000) {
            costOfSausage = productionCostFrom1000to2000Sausage * quantitySausage;
        } else if (quantitySausage >= 2000) {
            costOfSausage = productionCostMoreThan2000Sausage * quantitySausage;
        }

        int costOfHam = productionCostHam * quantityHam;

        int costOfNeck = 0;
        if (quantityNeck < 500) {
            costOfNeck = productionCostLessThan500Neck * quantityNeck;
        } else if (quantityNeck >= 500) {
            costOfNeck = productionCostMoreThan500Neck * quantityNeck;
        }

        int costAll = costOfSausage + costOfHam + costOfNeck;
        int expensesAll = costAll + overheads;

        int marginalProfit = incomeAll - expensesAll;

        //Расчет налогов
        int calculationBase = marginalProfit;
        double rate8 = 0.08;
        double rate10 = 0.1;
        double rate13 = 0.13;
        double tax8 = 0;
        double tax10 = 0;
        double tax13 = 0;

        if (marginalProfit <= 1_000_000) {
            tax8 = rate8 * calculationBase;
            calculationBase = calculationBase - calculationBase;
        } else if (marginalProfit > 1_000_000 && marginalProfit <= 2_000_000) {
            tax8 = rate8 * 1_000_000;
            calculationBase = calculationBase - 1_000_000;
            tax10 = rate10 * calculationBase;
            calculationBase = calculationBase - calculationBase;
        } else if (marginalProfit > 2_000_000) {
            tax8 = rate8 * 1_000_000;
            calculationBase = calculationBase - 1_000_000;
            tax10 = rate10 * 1_000_000;
            calculationBase = calculationBase - 1_000_000;
            tax13 = rate13 * calculationBase;
            calculationBase = calculationBase - calculationBase;
        }

        double generalTax = tax8 + tax10 + tax13;
        double profit = marginalProfit - generalTax;

        System.out.println(profit);

    }

    public static void ex4_1() {
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг

        int quantitySausage = 2000;
        int productionCostSausage = getProductCost(SAUSAGE, quantitySausage);

        int quantityHam = 8511;
        int productionCostHam = getProductCost(HAM, quantityHam);

        int quantityNeck = 6988;
        int productionCostNeck = getProductCost(NECK, quantityNeck);

        long overheads = 1_000_000;

        long incomeAll = calcIncome(
                new int[]{SAUSAGE.getSellingPrice(), HAM.getSellingPrice(), NECK.getSellingPrice()},
                new int[]{quantitySausage, quantityHam, quantityNeck});

        long expensesAll = calcExpenses(
                new int[]{productionCostSausage, productionCostHam, productionCostNeck},
                new int[]{quantitySausage, quantityHam, quantityNeck}, overheads);

        long marginalProfit = incomeAll - expensesAll;

        //Расчет налогов
        long calculationBase = marginalProfit;
        double taxTotal = calcTax(calculationBase, marginalProfit);
        double profit = marginalProfit - taxTotal;

        System.out.println(profit);
    }

    private static long calcIncome(int[] prices, int[] quality) {
        long result = 0;
        for (int i = 0; i < prices.length; i++) {
            result += prices[i] * quality[i];
        }
        return result;
    }

    private static long calcExpenses(int[] cost, int[] quality, long overheads) {
        return calcIncome(cost, quality) + overheads;
    }

    private static double calcTax(long calculationBase, long marginalProfit) {
        double taxTotal = 0;
        if (marginalProfit <= TAX_BEFORE_ONE_MILLION.getLimit()) {
            taxTotal = TAX_BEFORE_ONE_MILLION.getTaxRate() * calculationBase;
        } else if ((marginalProfit > TAX_BEFORE_ONE_MILLION.getLimit()) && (marginalProfit <= TAX_BEFORE_TWO_MILLION.getLimit())) {
            taxTotal = TAX_BEFORE_ONE_MILLION.getTaxRate() * 1_000_000;
            calculationBase = calculationBase - 1_000_000;
            taxTotal += TAX_BEFORE_TWO_MILLION.getTaxRate() * calculationBase;
        } else if (marginalProfit > TAX_BEFORE_ONE_MILLION.getLimit() && marginalProfit < TAX_AFTER_TWO_MILLION.getLimit()) {
            taxTotal = TAX_BEFORE_ONE_MILLION.getTaxRate() * 1_000_000;
            calculationBase = calculationBase - 1_000_000;
            taxTotal += TAX_BEFORE_TWO_MILLION.getTaxRate() * 1_000_000;
            calculationBase = calculationBase - 1_000_000;
            taxTotal += TAX_AFTER_TWO_MILLION.getTaxRate() * calculationBase;
        }
        return taxTotal;
    }

    private static int getProductCost(Product product, int quantity) {
        if (product == SAUSAGE) {
            if (quantity < 1000) {
                return 412;
            } else if (quantity >= 1000 && quantity < 2000) {
                return 408;
            }
            return 404;
        } else if (product == Product.HAM) {
            return 275;
        } else if (product == NECK) {
            if (quantity < 500) {
                return 311;
            }
            return 299;
        }
        throw new RuntimeException("Неизвестный тип продукта.");
    }
}