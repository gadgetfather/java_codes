import java.util.Scanner;

//Fibonacci Series In Java Programs
public class FIbonacci {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8...
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number till which you want the series");
        int first = 0, second=1;
        int n = input.nextInt();
        System.out.println(first);
        System.out.println(second);
        for (int i = 2;i<n;i++){
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
