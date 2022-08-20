import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Simple_interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a principle");
        float principle = input.nextFloat();
        System.out.println("Enter a interest rate");
        float interestRate = input.nextFloat();
        System.out.println("Enter a time period in years");
        float time = input.nextFloat();
        float result =  (principle * (1+(interestRate/100) * time));
        System.out.println("final amount is " + result );


    }
}
