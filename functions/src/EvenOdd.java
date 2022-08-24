import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class EvenOdd {
    public static void main(String[] args) {
       boolean result = evenOdd();
       if (result){
           System.out.println("Even");
       }else {
           System.out.println("Odd");
       }
    }
    static boolean evenOdd(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if(num%2==0){
            return true;
        }else {
            return false;
        }
    }
}
