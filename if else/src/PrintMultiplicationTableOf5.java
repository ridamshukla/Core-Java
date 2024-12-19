import java.util.Scanner;

public class PrintMultiplicationTableOf5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(i+" * "+num+" = "+(i*num));
            i++;
        }
    }
}
