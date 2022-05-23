package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int all = rows * cols;
        double price = 0;
        switch (type) {
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5;
                break;


        }
        double totalIncome = price * all;
        System.out.printf("%.2f leva", totalIncome);

    }
}
