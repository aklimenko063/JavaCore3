package org.example.lessons.lesson10.ex1;

import org.example.lessons.lesson10.ex2.FileWriterWithLn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        output();
    }

    /**
     * Пример подмены потока вывода из консоли в текстовый файл.
     */
    private static void output() throws IOException {
        String logFile = "C:\\work\\repos\\java_core_3\\log.txt";
        FileOutputStream outputStream = new FileOutputStream(logFile);
        System.setOut(new PrintStream(outputStream));
        System.out.println("text");
        System.out.println("метод output.txt выполнен!");
    }

    /**
     * output.txt - Вывод данных из программы.
     * Простейший пример вывода данных в файл.
     */
    private static void outputSimple() throws IOException {
        String filename = "C:\\work\\repos\\java_core_3\\output.txt.txt";
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write("Дамир - гений!");
            fileWriter.write("Дамир - гений!");
            fileWriter.write("Дамир - гений!");
        }
    }

    /**
     * Input - Ввод данных в программу
     * Простейший пример чтения данных из файла
     */
    private static void input() throws IOException {
        //Путь до файла
        String filename = "C:\\work\\repos\\java_core_3\\test.txt.txt";
        try (FileReader fileReader = new FileReader(filename);) {
            String result = "";
            while (fileReader.ready()) {
                //Чтение происходит посимвольное
                result += (char) fileReader.read();
            }
            System.out.println(result);
        }
    }

    /**
     * Пример чтения данных из консоли
     */
    private static void inputConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            String readLine = scanner.nextLine();
            System.out.println(readLine);
        }
    }

    /**
     * Пример чтения файла построчно с помощью класса Scanner
     */
    private static void inputScanner() throws FileNotFoundException {
        File file = new File("C:\\work\\repos\\java_core_3\\test.txt.txt");
        try (Scanner scanner = new Scanner(file);) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}