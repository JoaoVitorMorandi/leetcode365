import java.util.HashMap;

public class MostAppearingCharacter {

    public static void main(String[] args) {
        String value = "geeksforgeeks";
        System.out.println(mostAppearingNumber(value));
    }

    public static char mostAppearingNumber(String s){
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            char value = arr[i];
            if(map.containsKey(value)){
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 0);
            }
        }

        int mostRepeating = 0;
        char c = ' ';
        for (char key : map.keySet()) {
            if (map.get(key) > mostRepeating) {
                mostRepeating = map.get(key);
                c = key;
            }
        }
        return c;
    }
}
