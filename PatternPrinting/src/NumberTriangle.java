import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of stars you want to print: ");
        int numOfStars = input.nextInt();
        System.out.print("enter of number of line you want to print star: ");
        int numOfLine = input.nextInt();

        int i = 1;
        while(i <= numOfLine){
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }

        // Second Way To Print Number Triangle

        int i1 = 1;
        while(i1 <= numOfLine){
            int j1 = 1;
            while(j1 <= i1){
                System.out.print(i1);
                j1++;
            }
            System.out.println();
            i1++;
        }


    }
}
