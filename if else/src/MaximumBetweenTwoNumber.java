import java.util.Scanner;

public class MaximumBetweenTwoNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number1: ");
        int num1 = input.nextInt();
        System.out.print("enter number2: ");
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("num1 is greater: ");
        } else{
            System.out.println("num2 is greater: ");
        }
    }
}
