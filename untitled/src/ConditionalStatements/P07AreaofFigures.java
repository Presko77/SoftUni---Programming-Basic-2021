package ConditionalStatements;

import java.util.Scanner;

public class P07AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = (scanner.nextLine());
        double area =0;
        if (type.equals("square")) {
            double l = Double.parseDouble(scanner.nextLine());
            area = l*l;
        }else if (type.equals("rectangle")) {
            double w = Double.parseDouble(scanner.nextLine());
            double l = Double.parseDouble(scanner.nextLine());
            area = w*l;
        }else if (type.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area= Math.PI*r*r;
        }else if (type.equals("triangle")) {
            double l = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area=(l*h)/2;
        }
        System.out.printf("%.3f" , area);
    }
}
