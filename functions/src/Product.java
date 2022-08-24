import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Product {
    public static void main(String[] args) {
        int result = product();
        System.out.println(result);
    }
    static int product(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter a second number");
        int num2 = input.nextInt();
        return num1*num2;
    }
}
