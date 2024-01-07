package org.example.lessons.lesson10.ex3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Runner {
    /**
     * Пример использования файла из папки resources.
     * В данном случае нет необходимости писать абсолютный путь.
     */
    public static void main(String[] args) throws IOException {
        try (InputStream stream = Runner.class.getClassLoader().getResourceAsStream("prices.txt.txt");
             Scanner scanner = new Scanner(stream)) {
            System.out.println(scanner.nextLine());
        }
    }
}