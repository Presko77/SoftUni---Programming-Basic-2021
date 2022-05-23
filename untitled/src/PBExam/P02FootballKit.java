package PBExam;

import java.util.Scanner;

public class P02FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double sumForBall = Double.parseDouble(scanner.nextLine());
        double shortsPrice = shirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double shoePrice = (shirtPrice + shortsPrice) * 2;

        double allPrice = shirtPrice + shortsPrice + socksPrice + shoePrice;
        double priceWithDiscount = allPrice - (allPrice * (15 / 100.0));
        double sumNeed = sumForBall - priceWithDiscount;

        if (priceWithDiscount >= sumForBall) {

            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.", priceWithDiscount);
        }else{
            System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.",sumNeed);
        }
    }
}
