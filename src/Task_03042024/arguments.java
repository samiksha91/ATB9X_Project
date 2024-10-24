package Task_03042024;

public class arguments {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("the two numbers are %d %d \n",a,b);

        int num = (a > b ? a : b);
        System.out.printf("he largest number between %d and %d is %d ",a,b,num);



    }
}
