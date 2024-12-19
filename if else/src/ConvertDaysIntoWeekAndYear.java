import java.util.Scanner;

public class ConvertDaysIntoWeekAndYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter days: ");
        int days = input.nextInt();
        double year = days/365;
        int weeks = days /7;
        int month = days/30;
        System.out.println(year+" year");
        System.out.println(weeks+" weeks");
        System.out.println(month+" month");
    }
}
