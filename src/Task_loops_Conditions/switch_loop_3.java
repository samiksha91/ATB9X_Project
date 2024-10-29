package Task_loops_Conditions;

import java.util.Scanner;

public class switch_loop_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (1 or 2):");
        int choice = scanner.nextInt();

        switch (choice){

            case 1:
                System.out.println("Enter Kilometer:");
                double km = scanner.nextDouble();
                double miles = (km * 0.621371);
                System.out.println(miles);
                break;

            case 2:
                System.out.println("Enter fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + celsius);
                break;

            default:
                System.out.println("Invalid number");
                break;

        }
        scanner.close();
    }
}
