import java.util.Scanner;

public class CountNumberOfDigitInNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter digit: ");
        int digit = input.nextInt();
        int count = 0;
        while(digit != 0){
            count++;
            digit /= 10;
        }
        System.out.println(count);
    }
}
