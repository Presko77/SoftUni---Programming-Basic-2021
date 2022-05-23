package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String type = "";
        String destination = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            System.out.printf("Somewhere in %s%n", destination);
            if (season.equals("summer")) {
                price = budget * 0.30;
                type = "Camp";
            } else {
                price = budget * 0.70;
                type = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            System.out.printf("Somewhere in %s%n", destination);
            if (season.equals("summer")) {
                price = budget * 0.40;
                type = "Camp";
            } else {
                price = budget * 0.80;
                type = "Hotel";
            }
        } else {
            destination = "Europe";
            System.out.printf("Somewhere in %s%n", destination);
            price = budget * 0.90;
            type = "Hotel";
        }
        System.out.printf("%s - %.2f", type, price);
    }
}
