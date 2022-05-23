package PBExam;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoints = Integer.parseInt(scanner.nextLine());
        String bestPlayer = scanner.nextLine();

        while (true) {
            String line = scanner.nextLine();
            if (line=="END") {
                System.out.printf("%s is the best player!%n", bestPlayer);
                if (maxPoints >= 3) {
                    System.out.printf("He has scored %d goals and made a hat-trick !!!", maxPoints);
                } else {
                    System.out.printf("He has scored %d goals.", maxPoints);
                }
            }
            else{
                int points = Integer.parseInt(scanner.nextLine());
                if (points>maxPoints) {
                    bestPlayer = line;
                    maxPoints=points;
                }
            }
        }
    }
}
