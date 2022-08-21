import java.util.Scanner;

// Area Of Rhombus
public class AreaRhombus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first diagonal length");
        int first_diagonal = input.nextInt();
        System.out.println("Enter second diagonal length");
        int second_diagonal = input.nextInt();
        int result = (first_diagonal*second_diagonal)/2;
        System.out.println(result);
    }
}
