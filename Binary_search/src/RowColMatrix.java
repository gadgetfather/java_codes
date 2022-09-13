import java.sql.Array;
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int [] result = search(arr,37);
        System.out.println(Arrays.toString(result));
    }
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix[0].length - 1; // edge case to check if matrix is 1-D array
        while ((row >= 0 && row < matrix.length) &&
                (col >= 0 && col< matrix[0].length)){
            if(matrix[row][col] == target){
                return  new int[] {row,col};
            } else if (matrix[row][col]>target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
