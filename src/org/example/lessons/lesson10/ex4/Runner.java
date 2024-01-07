package org.example.lessons.lesson10.ex4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    /**
     * Практический пример записи чисел от 1 до 101 с каждой новой строки
     * и вывода каждой второй строки из созданного файла.
     */
    public static void main(String[] args) throws IOException {
        String filename = "C:\\work\\repos\\java_core_3\\test.txt.txt";
        try (FileWriter fileWriter = new FileWriter(filename)) {
            for (int i = 1; i < 101; i++) {
                fileWriter.write(i + "\n");
            }
        }

        try (Scanner scanner = new Scanner(new File(filename))) {
            int numberLine = 1;
            while (scanner.hasNext()) {
                if (numberLine % 2 == 0) {
                    System.out.println(scanner.nextLine());
                }
                numberLine++;
            }
        }
    }
}