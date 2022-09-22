package src;
// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
    int[] arr = {4,0,2,1};
    int result = findNum(arr,4);
        System.out.println(result);
    }
    static int findNum(int[] arr,int n){
        int i = 0;
        int num;
        while(i< arr.length){
            if(i != n){
            if(arr[i] != i){
                int firstElement = arr[i];
                int secondIndex = arr[i] - 1;
                int secondElement = arr[arr[i] - 1];

                arr[i] = secondElement;
                arr[secondIndex] = firstElement;
            } else {
                i++;
            }
        }
        for (int j= 0; j<arr.length;j++){
            if(j != arr[j]){
                return j;
            }
        }
        return -1;
    }
}
