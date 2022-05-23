package FirstSteps;

import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);

        String firstName = Scan.nextLine();
        String lastName = Scan.nextLine();
        int age = Integer.parseInt(Scan.nextLine());
        String town = Scan.nextLine();

        //You are <firstName> <lastName>, a <age>-years old person from <town>.

        System.out.println("You are " +
                firstName +
                " " +
                lastName +
                ", a " +
                age +
                "-years old person from " +
                town +
                ".") ;


    }
}
