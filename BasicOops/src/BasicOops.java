import java.util.Scanner;
 class Ridam{
     void run(){
         System.out.println("Run");
     }
     void Sum(){
         int a = 1; int b = 1; int c;
         c = a+b;
         System.out.println(c);
     }
     void mul(){
         int a = 2; int b = 2; int c;
         c = a * b;
         System.out.println(c);
     }
     void div(){
         int a = 2; int b = 4; int c;
         c = b / a;
         System.out.println(c);
     }
     void sub(){
         int a = 2; int b = 2; int c;
         c = a - b;
         System.out.println(c);
     }
 }
public class BasicOops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Ridam r = new Ridam();
        r.mul();
        r.Sum();
        r.sub();
        r.div();
    }
}
