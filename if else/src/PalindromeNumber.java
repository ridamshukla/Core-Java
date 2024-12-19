import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        int num1 = num;
        int rev = 0;
        while(num1 != 0){
            int last = num1 % 10;
            rev = rev*10+last;
            num1 /= 10;
        }
        if(rev == num){
            System.out.println("number is palinrome: ");
        } else{
            System.out.println("number is not palindrome: ");
        }
    }
}
