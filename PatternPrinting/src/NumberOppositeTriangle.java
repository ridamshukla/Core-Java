import java.util.Scanner;

public class NumberOppositeTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number You Want To Start With: ");
        int Num = input.nextInt();

        int k = Num;
        int i = 0;
        while(i <= Num){
            int j = k;
            while(j >= 0){
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
            k--;
        }
    }
}
