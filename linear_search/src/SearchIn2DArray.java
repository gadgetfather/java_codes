import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
    int [][] arr = {{1,2,3},{4,5,6},{7,8,9,}};
    int [] ans = search(arr,5);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        int[] ans;
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{col,row};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
