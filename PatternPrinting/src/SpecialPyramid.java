import java.util.Scanner;

public class SpecialPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        int d = 1;
        int c = num;
        int sum = num+num;
        int i = 1;
        while(i <= sum){
            int j = i;
            while(j <= num){
                System.out.print("*");
                j++;
            }
            int a = 1;
            while(a < d){
                System.out.print(" ");
                a++;
            }
            int k = c;
            while(k < sum){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
            c++;
            d += 2;
        }
    }
}
