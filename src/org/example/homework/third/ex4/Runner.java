package org.example.homework.third.ex4;

public class Runner {
    public static int ticketNumber = 1;
    public static void main(String[] args) {
        int totalReward = 0;
        int countTicket = 110;
        for (int i = 1; i <= countTicket; i++) {
            LotteryTicket ticket = new LotteryTicket();
            totalReward += ticket.checkYourLuck();
            ticketNumber++;
        }
        System.out.println("Сумма вознаграждения: " + totalReward);
    }
}
