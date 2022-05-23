package ConditionalStatementsExercise;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fTime = Integer.parseInt(scanner.nextLine());
        int sTime = Integer.parseInt(scanner.nextLine());
        int tTime = Integer.parseInt(scanner.nextLine());

        int totalSec = fTime + sTime + tTime;
        int min =  totalSec / 60;
        int sec = totalSec % 60;

        if (sec <10) {
            System.out.printf("%d:0%d", min, sec);
        }else{
            System.out.printf("%d:%d", min, sec);

        }
    }
}
