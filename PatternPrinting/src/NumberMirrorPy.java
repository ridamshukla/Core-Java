import java.util.Scanner;

public class NumberMirrorPy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a1 = 4;
        int b = 1;
        int i = 1;
        while(i <= 5){
            int a = b;
            int j = 1;
            while(j <= 5){
                if(j >= i){
                    System.out.print(a+" ");
                    a++;
                } else{
                    System.out.print(" ");
                }
                j++;

            }
            System.out.println();
            i++;
            b++;
        }
        int  i1 = 1;
        while(i1 <= 5){
            int j1 = 1;
            while(j1 <= 5){
                if(j1 >= a1 && i1 < 5){
                    System.out.print(j1+" ");
                } else {
                    System.out.print(" ");
                }
                j1++;
            }
            System.out.println();
            i1++;
            a1--;
        }
    }
}
