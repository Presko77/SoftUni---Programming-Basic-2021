package examPrepIZPIT;

import java.util.Scanner;

public class P05EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggFirstPlayer = Integer.parseInt(scanner.next());
        int eggSecondPlayer = Integer.parseInt(scanner.next());

        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            if (input.equals("one")) {
                eggSecondPlayer--;
            } else if (input.equals("two")){
                eggFirstPlayer--;
            }

            if( eggFirstPlayer == 0 || eggSecondPlayer == 0) {
                break;
            }

            input = scanner.nextLine();
        }
        if (eggFirstPlayer == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.",eggSecondPlayer);
        }else if (eggSecondPlayer==0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggFirstPlayer);
        }else{
            System.out.printf("Player one has %d eggs left.%n",eggFirstPlayer);
            System.out.printf("Player two has %d eggs left.%n",eggSecondPlayer);
        }
    }
}
