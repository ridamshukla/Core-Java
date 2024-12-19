import java.util.Scanner;

public class PrintTotalNumberOfdaysInMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter month number: ");
        int num = input.nextInt();
        if(num == 2) {
            System.out.println("28");
        } else if(num % 2 != 0 && num < 8 ||  num == 8){
            System.out.println("31");
        } else if(num > 8) {
            if (num % 2 == 0) {
                System.out.println("31");
            }
            else{
                System.out.println("30");
            }
        }

    }


}
