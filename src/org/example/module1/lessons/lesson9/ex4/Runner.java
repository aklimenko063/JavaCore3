package org.example.module1.lessons.lesson9.ex4;

public class Runner {
    /**
     * Пример использования конструкции try with resources
     */
    public static void main(String[] args) {
//        До try with resources
        Microwave microwave = new Microwave();
        try {
            microwave.work();
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            microwave.close();
        }

        //С try with resources
//        try (Microwave microwave = new Microwave()) {
//            microwave.work();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}