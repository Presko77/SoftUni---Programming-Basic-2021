package examPrepIZPIT;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double berriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double berriesQuantity = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = berriesPrice / 2;
        double orangesPrice = raspberriesPrice - (0.4 * raspberriesPrice);
        double bananasPrice = raspberriesPrice - (0.8 * raspberriesPrice);

        double raspberriesSum = raspberriesQuantity * raspberriesPrice;
        double orangesSum = orangesQuantity * orangesPrice;
        double bananasSum = bananasQuantity * bananasPrice;
        double berriesSum = berriesQuantity * berriesPrice;

        double sum = raspberriesSum + orangesSum + bananasSum + berriesSum;

        System.out.printf("%.2f",sum);


    }
}
