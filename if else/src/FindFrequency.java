import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("enter digit: ");
       int digit = input.nextInt();
       while(digit != 0){
           int count = 0;
           int tik = digit;
           int last = tik % 10;
           tik /= 10;
           while(tik != 0){
               int fast = tik % 10;
               if(last == fast){
                   count++;
                   System.out.print(tik+" frequency is "+count);
               }
               tik /= 10;
           }
           System.out.println();
           digit /= 10;
       }


    }
}
