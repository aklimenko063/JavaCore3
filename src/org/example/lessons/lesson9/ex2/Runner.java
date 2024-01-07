package org.example.lessons.lesson9.ex2;

public class Runner {
    public static void main(String[] args) {
//        WolfPride wolfPride = new WolfPride();
//        wolfPride.prideWolf();
        try {
            recursion();
        } catch (StackOverflowError error) {
            System.out.println("ERROR!");
        }
    }


    public static void recursion() {
        recursion();
    }
}