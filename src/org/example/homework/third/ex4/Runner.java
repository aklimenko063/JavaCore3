package org.example.homework.third.ex4;

public class Runner {
    public static void main(String[] args) {
        int countTicket = 110;
        for (int i = 1; i <= countTicket; i++) {
            LotteryTicket ticket = new LotteryTicket();
            ticket.checkYourLuck();
        }
        System.out.println("Сумма вознаграждения: " + LotteryTicket.totalReward);
    }
}
