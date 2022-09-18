package src;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
int[] arr = {5,3,4,2,1};
cylic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cylic(int[] arr){
        int i = 0;
        while(i< arr.length){
            if(arr[i]-1 != i){
               int firstElement = arr[i];
               int secondIndex = arr[i] - 1;
               int secondElement = arr[arr[i] - 1];

               arr[i] = secondElement;
               arr[secondIndex] = firstElement;
            } else {
                i++;
            }
        }
    }
}
