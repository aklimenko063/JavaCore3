package org.example.homework.third.ex4;

public class LotteryTicket {
    public int checkYourLuck() {
        int reward = 0;
        int reward10 = 100;
        int reward100 = 5_000;
        int ticketNumber = Runner.ticketNumber;

        if (ticketNumber % 100 == 0) {
            reward = reward100;
            System.out.println("Билет №" + ticketNumber + ". Вы выиграли " + reward100 + " руб.");
        } else if (ticketNumber % 10 == 0) {
            reward = reward10;
            System.out.println("Билет №" + ticketNumber + ". Вы выиграли " + reward10 + " руб.");
        }
        return reward;
    }
}
