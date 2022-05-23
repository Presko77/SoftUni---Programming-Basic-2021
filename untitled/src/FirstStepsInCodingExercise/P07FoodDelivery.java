package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        	Пилешко меню –  10.35 лв.
	        Меню с риба – 12.40 лв.
	        Вегетарианско меню  – 8.15 лв.

         */
        // цена на десерт 20% от цялата сметка без цената за доставка
        // доставка 2.50

        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishCount = Integer.parseInt(scanner.nextLine());
        int vegetarianCount = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenCount * 10.35;
        double fishPrice = fishCount * 12.40;
        double vegetarianPrice = vegetarianCount * 8.15;
        double allWithoutDessert = chickenPrice + fishPrice+ vegetarianPrice;
        double dessertPrice = allWithoutDessert * 20 / 100; // друг вариант  double dessertPrice = allWithoutDessert - allWithoutDessert * (1-0.2);

        double totalPrice = chickenPrice + fishPrice+ vegetarianPrice + dessertPrice + 2.50; // не забравяме да добавим цената на доставката 2.50

        System.out.println(totalPrice);
    }
}


