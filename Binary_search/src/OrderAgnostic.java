public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        int result = binarySearch(arr,4);
        System.out.println(result);

    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end] ){
            while (start<=end){
                int mid = start + (end - start) / 2;

                if(target<arr[mid]){
                    end = mid -1;
                } else if (target>arr[mid]) {
                    start = start + 1;
                } else {
                    return  mid;
                }
            }
        } else if(arr[start] > arr[end]){
            while (start<=end){
                int mid = start + (end - start) / 2;

                if(target<arr[mid]){

                    start = start + 1;
                } else if (target>arr[mid]) {
                    end = mid -1;
                } else {
                    return  mid;
                }
            }
        }
        return  -1;
    }
}
