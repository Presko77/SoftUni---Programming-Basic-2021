package examPrepIZPIT;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetMovie = Double.parseDouble(scanner.nextLine());
        String location = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.next());

        int dailyPrice = 0;
        if (location.equals("Dubai")) {
            if (season.equals("Winter")) {
                dailyPrice = 45000;
            } else {
                dailyPrice = 40000;
            }
        } else if (location.equals("Sofia")) {
            if (season.equals("Winter")) {
                dailyPrice = 17000;
            } else {
                dailyPrice = 12500;
            }
        } else { // London
            if (season.equals("Winter")) {
                dailyPrice = 24000;
            } else {
                dailyPrice = 20250;
            }
        }
        double allDayPrice = days * dailyPrice;

        if (location.equals("Dubai")) {
            allDayPrice = allDayPrice - (allDayPrice * 0.3);
        } else if (location.equals("Sofia")) {
            allDayPrice = allDayPrice + (allDayPrice * 0.25);
        }
        double diff = Math.abs(allDayPrice - budgetMovie);
        if (allDayPrice <= budgetMovie) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);

        }
    }
}



