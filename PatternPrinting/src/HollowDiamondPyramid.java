import java.util.Scanner;

public class HollowDiamondPyramid{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int e = 7;
        int a = 4;
        int k = 4;
        int i = 1;
        while(i <= 5){
            int j = 1;
            while(j <= 7){
                if(j == k || j == a || i == 5 && j == 1 || i==5 && j==7 ){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                j++;
            }

                System.out.println();
            i++;
            a--;
            k++;
        }
        int i1 = 1;
        while(i1 <= 5){
            int j1 = 1;
            while(j1 <= 7){
                if(i1 <= 4 && i1 == j1){
                    System.out.print("*");
                } else if(j1 == e && e >= 5){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                j1++;
            }
            System.out.println();
            i1++;
            e--;
        }
    }
}
