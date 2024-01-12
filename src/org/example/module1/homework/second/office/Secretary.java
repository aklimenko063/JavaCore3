package org.example.homework.second.office;

public class Secretary {
    private static final String employee = "Секретарь";

    public void speech (String bossName, String managerName, String securityName) {
            System.out.printf("%s: - %s не волнуйтесь, %s все успеет. %s - подождите!\n",
                    employee, bossName, managerName, securityName);
    }
}