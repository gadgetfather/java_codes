import java.util.Scanner;

//Area Of Parallelogram
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a base");
        float base = input.nextFloat();
        System.out.println("Enter a height");
        float height = input.nextFloat();
        float result = base*height;
        System.out.println(result);
    }
}
