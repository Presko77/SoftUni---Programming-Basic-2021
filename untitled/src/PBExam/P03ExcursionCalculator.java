package PBExam;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double priceForPeople = 0;
        if (season.equals("spring")) {
            if (allPeople <= 5) {
                priceForPeople = 50.00;
            } else {
                priceForPeople = 48.00;
            }
        } else if (season.equals("summer")) {
            if (allPeople <= 5) {
                priceForPeople = 48.50;
            } else {
                priceForPeople = 45.00;
            }
        } else if (season.equals("autumn")) {
            if (allPeople <= 5) {
                priceForPeople = 60.00;
            } else {
                priceForPeople = 49.50;
            }
        }
         else if (season.equals("winter")){
            if (allPeople <= 5) {
                priceForPeople = 86.00;
            } else {
                priceForPeople = 85.00;
            }
        }
        double priceForAllPeople = priceForPeople * allPeople;
        double discount = 15;
        if (season.equals("summer")) {
            discount = 15;
            priceForAllPeople = priceForAllPeople - (priceForAllPeople * (discount / 100.0));
        } else if (season.equals("winter")) {
            discount = 8;
            priceForAllPeople = priceForAllPeople + (priceForAllPeople * (discount / 100.0));
        }
        System.out.printf("%.2f leva.", priceForAllPeople);
    }
}

