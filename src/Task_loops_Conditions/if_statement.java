package Task_loops_Conditions;

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int age = scanner.nextInt();

        if (age > 20) {
            System.out.println("Allowed to vote");
        }
    }
}
