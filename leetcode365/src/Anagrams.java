import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

    public static void main(String[] args) {
        String[] a = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Arrays.deepToString(anagrams(a)));
    }

    public static String[][] anagrams(String[] array) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : array) {
            char[] charWord = s.toCharArray();
            Arrays.sort(charWord);
            String sortedWord = new String(charWord);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }

        String[][] result = new String[map.size()][];
        int j = 0;
        for (ArrayList<String> group : map.values()) {
            result[j++] = group.toArray(new String[0]);
        }

        return result;
    }
}
