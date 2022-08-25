import java.util.Scanner;

// Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        palindromeCheck(num);
    }
    static void palindromeCheck(int num){
        int new_num = 0,temp=num;
        while (temp>0){
            int last_digit = temp % 10;
            new_num= new_num*10 + last_digit;
            temp = temp/10;
        }
        if (new_num == num){
            System.out.println("its palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
