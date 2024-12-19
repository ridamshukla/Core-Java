import java.util.Scanner;

public class CharacterTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter no of stars character you want to print: ");
        char numOfStars = input.next().charAt(0);
        System.out.print("enter of number of line you want to print star: ");
        int numOfLine = input.nextInt();
        int ch = (int)numOfStars;

        int i = 0;
        while(i < numOfLine){
            int j = 0;
            while(j <= i){
                System.out.print((char)(i + ch));
                j++;
            }
            System.out.println();
            i++;
        }



    }
}
