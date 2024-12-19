import java.util.Scanner;

public class CharacterIsAlphabetOrDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter character: ");
        char ch = input.next().charAt(0);
        int bittu = (int)ch;
        if(bittu >=0 && bittu <= 9 || bittu >= 16 && bittu <= 25 || bittu >= 32 && bittu <= 41 || bittu >= 48 && bittu <= 57){
            System.out.println("digit");
        } else if(bittu >= 65 && bittu <= 90 || bittu >= 97 && bittu <= 122){
            System.out.println("alphabet");
        } else{
            System.out.println("unique character: ");
        }
    }
}
