package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        •	Пакет химикали - 5.80 лв.
•	Пакет маркери - 7.20 лв.
•	Препарат - 1.20 лв (за литър)

         */
        // вход : брой химикалки, брой маркери, литри препарат, процент намаление
        // общо пари за химикалки : бр. химикалки * 5.80
        // общо пари за маркери : бр. маркери * 7.20
        // общо пари за препарат : литри препарат * 1.20
        // общо пари за книжарница, като сметнем и намалението на Ани

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int dsic = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double marketPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;

        double totalPrice = pensPrice + marketPrice + cleanerPrice;
        double totalPriceAfterDisc = totalPrice - (totalPrice * dsic/100);
        System.out.println(totalPriceAfterDisc);
    }
}
