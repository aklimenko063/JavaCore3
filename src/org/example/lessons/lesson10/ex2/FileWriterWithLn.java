package org.example.lessons.lesson10.ex2;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс обертка над классом FileWriter
 * Добавляет в конец текста всегда перевод строки.
 * Интерфейс Closeable нужен для возможности использования класса в try with resources
 */
public class FileWriterWithLn implements Closeable {
    private final FileWriter fileWriter;

    public FileWriterWithLn(String filename) {
        try {
            this.fileWriter = new FileWriter(filename, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(String text) {
        try {
            fileWriter.write(text + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}