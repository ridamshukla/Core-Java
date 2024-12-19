import java.util.Scanner;

public class CgiAskedPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 4;
        int k = 17;
        int a = 1;
        int i = 1;
        while(i <= 4){
            int j = 1;
            while(j <= 4) {
                if (j >= i) {
                    System.out.print(a);
                    if(j < 4) {
                        System.out.print("*");
                    }
                    a++;
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            int j1 = i;
            int b = k;
            while(j1 <= 4){
                System.out.print("*");
                System.out.print(b);
                j1++;
                b++;
            }
            System.out.println();
            i++;
            num--;
            k -= num;
        }
    }
}
