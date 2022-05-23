package FirstSteps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();//"10"

        int a = Integer.parseInt(input);//10

        int area=a*a;

        System.out.println(area);
    }
}
