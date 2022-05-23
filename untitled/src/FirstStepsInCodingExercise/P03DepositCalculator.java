package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percents = Double.parseDouble(scanner.nextLine());

        double sum = deposit + months * ((deposit * percents / 100) / 12);

        System.out.println(sum);

    }
}
