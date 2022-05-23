package examPrepIZPIT;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCounter = Integer.parseInt(scanner.nextLine());
        double availableFood = Double.parseDouble(scanner.nextLine());

        double totalFood = 0;
        double catFood = 0;
        double dogFood = 0;
        double totalBiscuits = 0;
        for (int i = 1; i <= daysCounter; i++) {

            double dogFoodCurrent = Double.parseDouble(scanner.nextLine());
            double catFoodCurrent = Double.parseDouble(scanner.nextLine());

            dogFood = dogFood + dogFoodCurrent;
            catFood = catFood + catFoodCurrent;

            double totalFoodCurrentDay = dogFoodCurrent + catFoodCurrent;

            if (i % 3 == 0) {

                totalBiscuits = totalBiscuits + (totalFoodCurrentDay*0.10);
            }
            totalFood = totalFood + (totalFoodCurrentDay);
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n",totalBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n",totalFood/availableFood*100.0);
        System.out.printf("%.2f%% eaten from the dog.%n",dogFood/totalFood*100.0);
        System.out.printf("%.2f%% eaten from the cat.%n",catFood/totalFood*100.0);



    }
}
