import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// take input in 2d array
public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for (int row = 0 ; row < arr.length; row++){
            //for each col in every row
            for (int col = 0; col< arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
//        for (int i = 0;i< arr2D.length;i++){
//            for (int j = 0;j<arr2D[i].length;j++){
//                arr2D[i][j] = in.nextInt();
//            }
//        }
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
