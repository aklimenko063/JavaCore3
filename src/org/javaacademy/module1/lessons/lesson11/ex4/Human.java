package org.javaacademy.module1.lessons.lesson11.ex4;

public class Human {
    private Hand handLeft = new Hand();
    private Hand handRight = new Hand();
    private Foot footLeft = new Foot();
    private String color;

    public class Foot {
        private int length;

    }

    public void doAction() {
        handLeft.takeFoot(footLeft);
    }

    public class Hand {
        private int countFingers = 5;

        public void takeFoot(Foot foot) {
            System.out.println("Взяли ногу в руку");
        }
    }
}
