import java.util.Scanner;

public class IntrestingJavaPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum1 = 1;
        int a = 8;
        int i = 1;
        while(i <= 7){
            int sum = 0;
            int a1 = a;
            int j = 1;
            while(j <= i){
                if(j == 1 && i > 1){
                    sum1 += a;
                    System.out.print(sum1+" ");
                    sum = sum1;
                    a1--;
                } else if(j >= 2 && i > 1){
                    sum -= a1;
                    System.out.print(sum+" ");
                    a1++;
                } else{
                    System.out.print(1);
                }
                j++;
            }
            System.out.println();
            i++;
            a--;
        }
    }
}
