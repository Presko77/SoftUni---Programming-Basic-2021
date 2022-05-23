package examPrepIZPIT;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        for (int i = first.charAt(0); i <= second.charAt(0); i++) {
            for (int j = first.charAt(1); j <= second.charAt(1); j++) {
                for (int k = first.charAt(2); k <= second.charAt(2); k++) {
                    for (int l = first.charAt(3); l <= second.charAt(3); l++) {

                        if (i % 2 != 0 &&
                                j % 2 != 0 &&
                                k % 2 != 0 &&
                                l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }

                    }

                }


            }

        }
    }
}
