package ForLoopExercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double moneyForBD = 0;
        int countMoneyFoBD = 0;
        int toysCount = 0;
        int countMoney = 0;
        for (int i = 1; i <= old; i++) {

            if (i % 2 == 0) {
                if (i == 2) {
                    moneyForBD = 10;
                } else {


                    moneyForBD = moneyForBD + 10.00 * i / 2;
                }
                countMoney++;
            } else {
                toysCount++;
            }

        }
        double totalMoneyForToys = toysCount * toyPrice;
        double totalMoneyForBD = moneyForBD - countMoney;
        double allMoney = totalMoneyForToys + totalMoneyForBD;

        if (washMachinePrice <= allMoney) {
            System.out.printf("Yes! %.2f", allMoney - washMachinePrice);
        } else {
            System.out.printf("No! %.2f", washMachinePrice - allMoney);
        }
    }
}
