package Task_03042024;

import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Name:");
        String name = scanner.nextLine();

        System.out.println("Enter the age:");
        int age = scanner.nextInt();

        System.out.println("Enter the salary:");
        double salary = scanner.nextDouble();


        System.out.println("Name=" + name);
        System.out.println("age=" + age);
        System.out.println("salary=" + salary);

        scanner.close();


    }
}
