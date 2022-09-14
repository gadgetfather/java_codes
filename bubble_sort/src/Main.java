import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        // boolean to track swapped case
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i< arr.length;i++){
            swapped = false;
           // for each step, max item will come at the last respective index
            for(int j = 1; j < arr.length - i; j++){

                // swap if the item is smaller than previous item
                if(arr[j]<arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if for particular value of i you did not swap then return.
            if(!swapped) {
               break;
            }
        }
    }
}
