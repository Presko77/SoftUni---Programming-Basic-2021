package PBExam;

import java.util.Scanner;

public class P04Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allDays = Integer.parseInt(scanner.nextLine());
        double firstDayKilometer = Double.parseDouble(scanner.nextLine());
        double sumAllKilometers = firstDayKilometer;

        for (int i = 1; i <= allDays; i++) {
            int moreKilometerPercent = Integer.parseInt(scanner.nextLine());
            firstDayKilometer = firstDayKilometer + (firstDayKilometer*moreKilometerPercent/100);
            sumAllKilometers += firstDayKilometer;


        }
        if (sumAllKilometers >1000) {
            double kilometersMore = Math.ceil(sumAllKilometers - 1000);
            System.out.printf("You've done a great job running %.0f more kilometers!", kilometersMore);
        }else{
            double kilometersMoreNeeded = Math.ceil(1000-sumAllKilometers);
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", kilometersMoreNeeded);
        }
    }
}
