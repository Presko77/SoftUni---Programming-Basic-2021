package WhileLoopLab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        while (true) {
            String tryPassword = scanner.nextLine();
            if (tryPassword.equals(password)) {
                break;
            }
        }
        System.out.printf("Welcome %s!",name);
    }
}
