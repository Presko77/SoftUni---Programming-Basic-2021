package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget*0.10;
        double extraPeopleClothesPrice = statists*clothesPrice;

        if (statists >150) {
            extraPeopleClothesPrice=extraPeopleClothesPrice-extraPeopleClothesPrice*0.10;
        }
        double totalPrice = decorPrice+extraPeopleClothesPrice;
        if (budget >=totalPrice) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }else{
            System.out.printf("Not enough money!%n" +
                    "Wingard needs %.2f leva more.",totalPrice - budget);

        }
    }
}
