import java.util.Scanner;

// Area Of Triangle
public class AreaTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a height");
        int height = input.nextInt();
        System.out.println("Enter a base");
        int base = input.nextInt();
        int result = (base*height)/2;
        System.out.println(result);
    }
}
