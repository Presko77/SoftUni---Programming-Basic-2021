package WhileLoopExercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String wantedBook = scanner.nextLine();
        String input = scanner.nextLine();
        boolean isFound = false;
        int wrongBook = 0;

        while (!input.equals("No More Books")){
            if (input.equals(wantedBook)){
                isFound=true;
                break;
            }
            wrongBook++;



            input=scanner.nextLine();
        }


        if (isFound) {
            System.out.printf("You checked %d books and found it.", wrongBook);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", wrongBook);
        }


    }

}
