package Task_loops_Conditions;

import java.util.Scanner;

public class else_if_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int score = scanner.nextInt();


        if(score >= 90 && score <= 100) {
            System.out.println("Print grade A");
        }
            else if (score >= 89 && score <= 80){
            System.out.println("Print grade B");
            }

            else if (score >= 79 && score <= 70){
            System.out.println("Print grade C");
        }
            else {
            System.out.println("Print grade F");
        }
        scanner.close();
    }

}
