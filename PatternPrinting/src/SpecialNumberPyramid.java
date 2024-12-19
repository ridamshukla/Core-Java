import java.util.Scanner;

public class SpecialNumberPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();

        int d = 1;
        int a = num;
        int b = num+1;
        int sum = num + num;
        int i = 1;
        while(i <= sum){
            int j = 1;
            while(j <= a){
                System.out.print(j);
                j++;
            }
            int c = 1;
            while(c < d){
                System.out.print(" ");
                c++;
            }
            int k = b;
            while(k <= sum){
                System.out.print(k);
                k++;
            }
            System.out.println();
            i++;
            b++;
            a--;
            d += 2;
        }
    }
}
