package ForLoopExercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilomandjaro = 0;
        int k2 = 0;
        int everest = 0;
        double total =0;

        for (int i = 0; i < countGroups; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            total +=group;
         if(group < 6) {
             musala += group;
         }else if (group<=12) {
             monblan += group;
         }else if (group<=25) {
             kilomandjaro += group;
         }else if (group<=40) {
             k2 += group;
         }else{
             everest+=group;
         }
        }
        double percentMusala = musala / total * 100;
        double percentMonblan = monblan / total * 100;
        double percentKilomandjaro = kilomandjaro / total * 100;
        double percentK2 = k2 / total * 100;
        double percentEverest = everest / total * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilomandjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
