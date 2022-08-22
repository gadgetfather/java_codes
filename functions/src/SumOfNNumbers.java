import java.util.Scanner;
// Write a function that returns the sum of first n natural numbers.
public class SumOfNNumbers {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int result = sum(num);
        System.out.println(result);
    }
     static int sum(int n){
        int sum=0;
        sum = (n*(n+1))/2;
        return sum;
    }
}
