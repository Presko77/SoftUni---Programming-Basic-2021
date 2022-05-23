package examPrepIZPIT;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int percentExpenses = Integer.parseInt(scanner.nextLine());

        if (countNights > 7) {
            nightPrice = nightPrice * 0.95;
        }

        double allNightsPrice = countNights * nightPrice;
        double additionalExpenses = budget * (percentExpenses / 100.0);

        double totalExpenses = allNightsPrice + additionalExpenses;

        double diff = Math.abs(totalExpenses - budget);
        if (budget >= totalExpenses) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}
