package FirstSteps;

import java.util.Scanner;

public class P05GreetingbyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, "+name+"!");
       // System.out.print("Hello, ");
        //System.out.print(name);
        //System.out.println("!");
    }
}
