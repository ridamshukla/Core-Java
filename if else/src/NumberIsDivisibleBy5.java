import java.util.Scanner;

public class NumberIsDivisibleBy5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();

        if(num % 5 == 0){
            System.out.println("number is divisible by 5: ");
        } else{
            System.out.println("number is not divisible by 5: ");
        }
    }
}
