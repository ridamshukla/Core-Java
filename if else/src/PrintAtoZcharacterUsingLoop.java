import java.util.Scanner;

public class PrintAtoZcharacterUsingLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 65;
        while(i <= 90){
            char hc = (char)i;
            System.out.print(hc+" ");
            i++;
        }
    }
}
