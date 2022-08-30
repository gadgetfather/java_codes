public class SearchInStrings {
    public static void main(String[] args) {
        String word = "Hello";
        char target = 'e';
        boolean result = searchInString(word,target);
        System.out.println(result);
    }
    static boolean searchInString(String word,char target){
        if(word.length()== 0){
            return false;
        }
        for (int i = 0;i<word.length();i++){
            if(word.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
