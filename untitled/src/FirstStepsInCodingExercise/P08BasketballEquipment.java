package FirstStepsInCodingExercise;

     import java.util.Scanner;

     public class P08BasketballEquipment  {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             int fee = Integer.parseInt(scanner.nextLine()); // годишната такси ни се подава от конзолата
             //смятаме колко ще ни струват обувките, екипа, топката и аксесоарите
             double sneakersPrice =  fee * (1-0.40); // друг вариант: double sneakers =  fee - fee * (40 / 100.00)
             double outfitPrice = sneakersPrice - (sneakersPrice * 20 / 100 ); // не слагаме .00 след 100, защото променливата за цена на екипа е double,
             // което означава, че и резултата ще е double
             double ballPrice = outfitPrice / 4;
             double accessoriesPrice = ballPrice / 5;

             double total = fee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice; // смятаме и годишната такса към другите

             System.out.println(total);

         }
     }


