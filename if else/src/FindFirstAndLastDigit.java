import java.util.Scanner;

public class FindFirstAndLastDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int digit = input.nextInt();
        int last = 0;
        int first = 0;
        int count = 0;
        while(digit != 0){
            count++;
            if(count == 1){
                 last = digit % 10;
            }
             first = digit%10;
            digit /= 10;
        }
        System.out.println("first digit is: "+first);
        System.out.println("last digit is: "+last);
    }
}
