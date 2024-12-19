import java.util.Scanner;

public class InputWeekNumberAndPrintDays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter week number: ");
        int num = input.nextInt();
        if(num == 0 || num > 7){
            System.out.println("invalid week number");
        } else {
            switch (num) {
                case 1:
                    System.out.println("sonday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("wednesday");
                    break;
                case 5:
                    System.out.println("thursday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;
                case 7:
                    System.out.println("staurday");
                    break;
            }
        }
    }
}
