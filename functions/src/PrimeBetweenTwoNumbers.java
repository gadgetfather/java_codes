import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class PrimeBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number");
        int start = input.nextInt();
        System.out.println("Enter a last number");
        int end = input.nextInt();
        primeBetweenTwo(start,end);
    }
    static void primeBetweenTwo(int start,int end){
        for (int i = start;i<end;i++){
            boolean result = checkPrime(i);
            if(result){
                System.out.println(i);
            }
        }
        return;
    }
    static boolean checkPrime(int num) {
        if(num == 0 || num == 1){
            return false;
        }
        for(int i= 2; i*i<=num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;

    }
}
