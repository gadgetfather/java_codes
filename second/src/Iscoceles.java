import java.util.Scanner;

//Area Of Isosceles Triangle
public class Iscoceles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a height");
        float height = input.nextFloat();
        System.out.println("Enter a base");
        float base = input.nextFloat();
        float result = (height*base)/2;
        System.out.println(result);

    }
}
