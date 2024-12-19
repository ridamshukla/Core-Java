import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter End Number You Want to Print: ");
        int num = input.nextInt();

        int i = 1;
        while(i <= num){
            int a = num;
            while(a > i){
                System.out.print(" ");
                a--;
            }
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            int k = 1;
            while(k < i){
                System.out.print(k);
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
