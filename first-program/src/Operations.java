import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Operations {
    public static void  main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number");
        int first = input.nextInt();
        System.out.println("Enter a second number");
        int second = input.nextInt();
        System.out.println("Enter a operation");
        char operation = input.next().charAt(0);
        if (operation=='*'){
            System.out.println(first*second);
        } else if (operation=='/') {
            System.out.println(first/second);
        } else if (operation=='+') {
            System.out.println(first+second);
        } else if (operation == '-') {
            System.out.println(first-second);
        } else {
            System.out.println("Invalid input");
        }
    }
}
