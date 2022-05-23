package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double VolumeSM = length * weight * high;

        double VolumeDS = VolumeSM / 1000.00;

        double needWater = VolumeDS * (1 - percent/100);

        System.out.println(needWater);
    }
}
