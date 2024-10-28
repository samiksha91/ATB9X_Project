package Task_03042024;

import java.util.Scanner;

public class scanner_example_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the First number : ");
        int num1 = scanner.nextInt();

        System.out.println("Input the second number :");
        int num2 = scanner.nextInt();

        System.out.println("Input the third number :");
        int num3 = scanner.nextInt();

        int smallest = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num3 ? num2 : num3);
        System.out.println("The smallest number is: " + smallest);


    }
}
