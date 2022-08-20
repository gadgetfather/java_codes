import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class PalindromeString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if its palindrome or not");
        String word = input.next();
        String nword="";
        for (int i = 0;i<word.length();i++){
            nword = word.charAt(i)+nword;
        }
        System.out.println("original word " + word);
        System.out.println("new word " + nword);
        if (word.equals(nword)){
            System.out.println("its palindrome!");
        }else{
            System.out.println("Its not palindrome!");
        }
    }
}
