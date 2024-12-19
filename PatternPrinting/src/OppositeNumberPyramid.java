import java.util.Scanner;

public class OppositeNumberPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number You Want To Print: ");
        int num = input.nextInt();
        int a = 1;
        int i = 0;
        while(i < num){
            int b = num;
            while(b > i){
                System.out.print(" ");
                b--;
            }
            int j = 1;
            while(j <= a){
                System.out.print(j);
                j++;
            }
            int k = i;
            while(k > 0){
                System.out.print(k);
                k--;
            }
            System.out.println();
            i++;
            a++;
        }
    }
}
