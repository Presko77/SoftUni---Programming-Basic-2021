package MoreEx;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double zelCena = Double.parseDouble(scanner.nextLine());
        double plodCena = Double.parseDouble(scanner.nextLine());
        int kgZel = Integer.parseInt(scanner.nextLine());
        int kgPlod = Integer.parseInt(scanner.nextLine());

        double cena = ((zelCena*kgZel)+(plodCena*kgPlod));
        double euro = cena/1.94;

        System.out.printf("%.2f",euro);



    }
}
