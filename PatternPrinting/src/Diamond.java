import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();

        int k = 1;
        int i = 1;
        while(i <= num){
            int a = i;
            while(a < num){
                System.out.print(" ");
                a++;
            }
            int j = 1;
            while(j <= k){
                System.out.print("*");
                j++;
            }
            System.out.println();
            k += 2;
            i++;
        }
        int r = k - 4;
        int s = 1;
        while(s <= num){
            int t = 1;
            while(t <= s){
                System.out.print(" ");
                t++;
            }
            int u = 1;
            while(u <= r){
                System.out.print("*");
                u++;
            }
            System.out.println();
            s++;
            r -= 2;
        }
    }
}
