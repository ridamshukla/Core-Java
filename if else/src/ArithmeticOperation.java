import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = input.nextInt();
        System.out.print("enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

        // substraction

        System.out.print("enter first number: ");
        int num3 = input.nextInt();
        System.out.print("enter second number: ");
        int num4 = input.nextInt();
        int sum1 = num3 - num4;
        System.out.println(sum1);

        // divide

        System.out.print("enter first number: ");
        int num5 = input.nextInt();
        System.out.print("enter second number: ");
        int num6 = input.nextInt();
        int sum2 = num5 / num6;
        System.out.print(sum2);
    }
}
