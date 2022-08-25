import java.util.Arrays;
import java.util.Scanner;

// swap two elements in array
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println("Array is "+Arrays.toString(arr));
        System.out.println("Enter a first index");
        int first = in.nextInt();
        System.out.println("Enter a second index");
        int second = in.nextInt();
        swap(arr,first,second);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
