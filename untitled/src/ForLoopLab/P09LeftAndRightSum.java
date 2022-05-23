package ForLoopLab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //left sum
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int currentSum = Integer.parseInt(scanner.nextLine());
            leftSum += currentSum;
        }
        //right sum
        for (int i = 0; i < n; i++) {
            int currentSum = Integer.parseInt(scanner.nextLine());
            rightSum += currentSum;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d%n", leftSum);
        }else{
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
        }
    }
}
