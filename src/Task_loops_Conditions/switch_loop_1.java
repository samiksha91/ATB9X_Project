package Task_loops_Conditions;

import java.util.Scanner;

public class switch_loop_1 {
    public static void main(String[] args) {

        System.out.println(" 1 - Add 2 - Subtraction 3 - Multiply  4 - Divide 5 - Modulus");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1");
        double num1 = scanner.nextDouble();

        System.out.println("Enter number 1");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator:");
        char operator = scanner.next().charAt(0);

        switch (operator){

            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case '*':
                System.out.println(num1*num2);
                break;

            case '/':
                System.out.println(num1/num2);
                break;

            case '%':
                System.out.println(num1%num2);
                break;

            default:
                System.out.println("invalid number");
                break;

        }
            scanner.close();
    }
}
