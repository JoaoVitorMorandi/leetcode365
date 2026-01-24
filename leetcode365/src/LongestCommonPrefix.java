public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }


    public static String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder("");
        String firstWord = strs[0];

        for(int i = 0; i < firstWord.length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length()){
                    return s.toString();
                }
                if(strs[j].charAt(i) != firstWord.charAt(i)){
                    return s.toString();
                }
            }
            s.append(firstWord.charAt(i));
        }
        return s.toString();
    }
}
