import java.util.Scanner;
// Reverse A String In Java
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to reverse");
        String word = input.next();
        char ch;
        String new_word ="";
        for (int i = 0; i<word.length();i++){
            ch = word.charAt(i);
            new_word = ch+new_word;
        }
        System.out.println(new_word);
    }
}
