package Task_loops_Conditions;

import java.util.Scanner;

public class else_if_practice_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1:");
        int side1 = scanner.nextInt();

        System.out.println("Enter side 2:");
        int side2 = scanner.nextInt();

        System.out.println("Enter side 3:");
        int side3 = scanner.nextInt();

        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("This is a negative number");
        }
        if (side1==side2 && side1==side3 && side2==side3){
            System.out.println("It is a triangle");
        }
        else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("It is a isoceles triangle");
        }
        else {
                System.out.println("It is scalene traingle");
            }
            
        }

    }

