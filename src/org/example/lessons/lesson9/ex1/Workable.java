package org.example.lessons.lesson9.ex1;

public interface Workable {
    /**
     * В случае RuntimeException нет нужды указывать в сигнатуре throws тип выбрасываемого исключения
     */
    void work();
}