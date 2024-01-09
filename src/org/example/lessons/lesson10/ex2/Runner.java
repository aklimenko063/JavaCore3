package org.example.lessons.lesson10.ex2;

public class Runner {
    /**
     * Пример создания своего класса для записи в файл.
     */
    public static void main(String[] args) {
        //Так как путь до файла абсолютный, то для каждого компьютера он будет свой
        String filename = "C:\\work\\repos\\java_core_3\\output.txt";

        try (FileWriterWithLn fileWriter = new FileWriterWithLn(filename)) {
            fileWriter.write("Дамир - гений!");
            fileWriter.write("Дамир - гений!");
            fileWriter.write("Дамир - гений!");
        }
    }
}