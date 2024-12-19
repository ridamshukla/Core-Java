import java.util.Scanner;

public class PrintMirrorImageTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of stars you want to print: ");
        int numOfStars = input.nextInt();
        System.out.print("enter of number of line you want to print star: ");
        int numOfLine = input.nextInt();

       int i = 1;
       while(i <= numOfLine){
           int j = i;
           while(j <= numOfStars){
              System.out.print("*");
              j++;
           }
           System.out.println();
           i++;
       }
    }
}
