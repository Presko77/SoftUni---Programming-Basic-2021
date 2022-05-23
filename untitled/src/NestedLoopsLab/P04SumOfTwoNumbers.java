package NestedLoopsLab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        boolean isValid = false;

        int counter = 0;
        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {

                counter++;
                int sum = i + j;
                if (sum == magicNum) {
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",
                            counter, i, j, sum);
                    break;
                }

            }
            if (isValid) {
                break;
            }

            }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
