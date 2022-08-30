public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {2,34,5,6,1};
        System.out.println(searchMin(arr));
    }
    static int searchMin(int[] arr){
        // assume arr.length != 0
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
