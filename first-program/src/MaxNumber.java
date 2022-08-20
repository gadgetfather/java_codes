//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter a second number");
        int second = input.nextInt();
        if(first>second){
            System.out.println(first+" is greater than "+ second);
        } else {
            System.out.println(second+" is greater than "+ first);
        }
    }
}
