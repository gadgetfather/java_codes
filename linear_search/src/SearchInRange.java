public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int start = 2;
        int end = 5;
        int target = 10;
        boolean result = search(arr,target,start,end);
        System.out.println(result);
    }
    static boolean search(int[] arr,int target,int start,int end){
        if(arr.length == 0 ){
            return false;
        }
        if(end > arr.length){
            return false;
        }
        for (int i = start;i<end;i++){
            if(arr[i]== target){
                return true;
            }
        }
        return false;
    }
}
