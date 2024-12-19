import java.util.Scanner;

public class ConverLengthCentimetertoMeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter length in centimeter: ");
        double length = input.nextDouble();
        double meter = length * 0.01;
        double kilometer = length * 1.00000;
        System.out.println("length in meter "+meter);
        System.out.println("length in kilometer "+kilometer);
    }
}
