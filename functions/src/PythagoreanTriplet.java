import java.util.Scanner;
// Write a function to check if a given triplet is a Pythagorean triplet or not.
public class PythagoreanTriplet {
    public static void main(String[] args) {
        boolean output = triplet();
        if (output){
            System.out.println("it is triplet");
        }else {
            System.out.println("It is not triplet");
        }
    }
   static boolean triplet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number in triplet");
        int num1 = input.nextInt();
        System.out.println("Enter a second number in triplet");
        int num2= input.nextInt();
        System.out.println("Enter a third number");
        int num3= input.nextInt();
        int num3Sqr = num3*num3;

        if (num3Sqr== (num1*num1)+(num2*num2)){
            return true;
        }else{
            return false;
        }
    }
}
