import java.util.Scanner;

public class ConverTemperatureCelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter temperature: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5)+32;
        System.out.println("temperature in fahrenheit: "+fahrenheit);

    }
}
