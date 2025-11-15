import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        boolean res = isAnagram("opa", "apo");
        System.out.println(res);
    } 

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Map<Character, Integer> alphabet = new HashMap<>();

        for(char a = 'a'; a <= 'z'; a++){
            alphabet.put(a, 0);
        }

        for(int i = 0; i < sArr.length; i++){
            alphabet.put(sArr[i], alphabet.get(sArr[i]) + 1);
            alphabet.put(tArr[i], alphabet.get(tArr[i]) - 1);
        }

        return alphabet.values().stream().allMatch(v -> v == 0);
    }

}