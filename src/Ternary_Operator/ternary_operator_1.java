package Ternary_Operator;

public class ternary_operator_1 {
    public static void main(String[] args) {
        int num = 50;
        String result = (num>=90) ? "A" : (num>=80) ? "B" : (num>=70) ? "C": "D";
        System.out.println("The largest number is"+  result);
    }
}
