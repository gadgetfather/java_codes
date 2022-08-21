import java.util.Scanner;

// Input a number and print all the factors of that number
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        for (int i = 1; i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
}
