package PBExam;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxGoals = 0;
        String name = "";

        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                name = input;

            }
            if (goals>=10){
                break;
            }

            input = scanner.nextLine();




        }
       if (maxGoals>=3) {
           System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", name, maxGoals);
       }else{
           System.out.printf("%s is the best player!%nHe has scored %d goals.",name, maxGoals);
       }

        }
    }

