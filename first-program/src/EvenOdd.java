import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOdd {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        if(a%2== 0){
            System.out.println("Even number");
        } else {
            System.out.println("odd number");
        }
    }
}
