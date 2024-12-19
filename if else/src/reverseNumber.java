import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        int rev = 0;
        while(num != 0){
            int last = num % 10;
            rev = rev*10+last;
            num /= 10;
        }
        System.out.println(rev);
    }
}
