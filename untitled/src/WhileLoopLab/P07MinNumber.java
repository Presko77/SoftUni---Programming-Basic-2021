package WhileLoopLab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int curNum = Integer.parseInt(input);
            if (curNum<minNumber) {
                minNumber=curNum;
            }
            input=scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
