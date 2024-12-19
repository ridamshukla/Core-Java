import java.util.Scanner;

public class BasicPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of stars you want to print: ");
        int numOfStars = input.nextInt();
        System.out.print("enter of number of line you want to print star: ");
        int numOfLine = input.nextInt();

        int i = 1;
        while(i <= numOfLine){
            int j = 1;
            while(j <= numOfStars){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        //  Same process of priting Number

        int a = 1;
        while(a <= numOfLine){
            int b = 1;
            while(b <= numOfStars){
                System.out.print(b);
                b++;
            }
            System.out.println();
            a++;
        }

        // Same As Character

        System.out.print("enter a character you Want to Start");
        char ch = input.next().charAt(0);
        int e = (int)ch;
        int c = 1;
        while(c <= numOfLine){
            int d = 0;
            while(d < numOfStars){
                System.out.print((char)(d+e));
                d++;
            }
            System.out.println();
            c++;
        }

    }
}
