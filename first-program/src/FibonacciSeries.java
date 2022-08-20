import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number upto which you want the fibonacci series");
        int n = input.nextInt();
        int first = 0;
        int second = 1,temp;
        System.out.println(first);
        System.out.println(second);
        for(int i = 2;i<n;i++){
            int third = first + second;
            System.out.println(third);

            first = second;
            second = third;
        }
    }
}
