public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abb"));
    }

    public static String longestPalindrome(String s) {
        if(s.length() == 1) return s;

        char[] arr = s.toCharArray();
        String longest = "" +arr[0];

        //bb
        for(int i = 0; i < s.length(); i++){
            String longestA = expandMiddle(arr, i, i, s);
            String longestB = expandMiddle(arr, i, i + 1, s);
            if(longestA.length() > longestB.length() && longestA.length() > longest.length()){
                longest = longestA;
            }
            if(longestB.length() > longestA.length() && longestB.length() > longest.length()){
                longest = longestB;
            }
        }

        return longest;

    }

    public static String expandMiddle(char[] arr, int initialPoint, int finalPoint, String s){
        int i = initialPoint;
        int f = finalPoint;
        String longest = "";

        while(i >= 0 && f < arr.length && arr[i] == arr[f]){
            longest = s.substring(i, f + 1);
            i--;
            f++;
        }

        return longest;
    }
}
