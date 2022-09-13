public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,4,9,8,14,16,28};
        int result = binary(arr,15);
        int floor = binaryFloor(arr,15);
        System.out.println(result);
        System.out.println(floor );
    }
    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ((end-start)/2);
            if(target<arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else  {
                return  mid;
            }
        }
        return start;
    }
    static int binaryFloor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ((end-start)/2);
            if(target<arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else  {
                return  mid;
            }
        }
        return end;
    }
}
