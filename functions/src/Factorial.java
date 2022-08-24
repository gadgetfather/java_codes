import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to gain factorial");
        int num = input.nextInt();
        int result =factorial(num);
        System.out.println(result);

    }
    static int factorial(int num){
        int product = 1;
        if (num == 0){
            return 1;
        }

        for (int i = num;i>0;i--){
            product = product*i;

        }
        return  product;
    }
}
