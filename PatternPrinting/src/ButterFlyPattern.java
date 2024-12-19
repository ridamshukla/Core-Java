import java.util.Scanner;

public class ButterFlyPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of star you want to print: ");
        int Star = input.nextInt();
        System.out.print("enter the number of line you want to print: ");
        int Line = input.nextInt();

        int sum = Line + Star;
        int a = sum;
        int i = 1;
        while(i <= sum){
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            int k = a;
            int b = j;
            while(j < sum){
                System.out.print(" ");
                j++;
            }
            while(k >= sum){
                System.out.print("*");
                k--;
            }
            System.out.println();
            i++;
            sum--;
        }
    }
}
