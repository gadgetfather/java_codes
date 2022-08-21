import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int temp = num;
        int product = 1,sum=0;
        while (temp!=0){
        int digit = temp %10;
        sum = sum + digit;
        product = product * digit;
        temp = temp /10;
        }
        int result = product- sum;
        System.out.println(result);
    }
}
