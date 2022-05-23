package PBExam;

import java.util.Scanner;

public class P01ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsPaper = Integer.parseInt(scanner.nextLine());
        int rowsCloth = Integer.parseInt(scanner.nextLine());
        double literGlue =Double.parseDouble(scanner.nextLine());
        int percentageReduction = Integer.parseInt(scanner.nextLine());

        double rowsPaperPrice = rowsPaper * 5.80;
        double rowsClothPrice = rowsCloth * 7.20;
        double gluePrice = literGlue * 1.20;

        double allPrice = rowsPaperPrice + rowsClothPrice + gluePrice;
        double priceReduction = allPrice - (allPrice*(percentageReduction/100.0));

        System.out.printf("%.3f",priceReduction);

    }
}
