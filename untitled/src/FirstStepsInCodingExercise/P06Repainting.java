package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double totalPaint = paint + (paint* 10/100.00);
        int totalNylon = nylon + 2;

        double nylonPrice = totalNylon * 1.50;
        double paintPrice = totalPaint *14.50;
        double thinnerPrice = thinner * 5;

        double totalPriceM = totalNylon * 1.50 + totalPaint * 14.50 + thinner * 5.00 + 0.40;
        double workmanMany = (totalPriceM*30/100) * workHours;
        double totalPrice = totalPriceM + workmanMany;
        System.out.println(totalPrice);
    }
}
