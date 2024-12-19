import java.util.Scanner;

public class CharacterIsVowelOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter character: ");
        char ch = input.next().charAt(0);
        int bittu = (int)ch;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel: ");
        } else if(bittu < 65 || bittu > 125){
            System.out.println("invalid character: ");
        } else{
            System.out.println("Consonent: ");
        }
    }
}
