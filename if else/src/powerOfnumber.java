import java.util.Scanner;

public class powerOfnumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        int power = num*num;
        System.out.println(power);
    }
}
