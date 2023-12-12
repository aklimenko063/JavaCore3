package org.example.homework.third.ex4;

public class LotteryTicket {
    public static int ticketNumber = 0;
    public static int totalReward = 0;
    public LotteryTicket() {
        ticketNumber++;
    }

    public void checkYourLuck() {
        int reward10 = 100;
        int reward100 = 5_000;

        if (ticketNumber % 100 == 0) {
            totalReward += reward100;
            System.out.println("Билет №" + ticketNumber + ". Вы выиграли " + reward100 + " руб.");
        } else if (ticketNumber % 10 == 0) {
            totalReward += reward10;
            System.out.println("Билет №" + ticketNumber + ". Вы выиграли " + reward10 + " руб.");
        }
    }
}
