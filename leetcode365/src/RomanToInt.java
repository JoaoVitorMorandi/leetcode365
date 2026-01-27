import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("VII"));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> values = new HashMap();
        values.put("I", 1);
        values.put("IV", 4);
        values.put("V", 5);
        values.put("IX", 9);
        values.put("X", 10);
        values.put("XL", 40);
        values.put("L", 50);
        values.put("XC", 90);
        values.put("C", 100);
        values.put("CD", 400);
        values.put("D", 500);
        values.put("CM", 900);
        values.put("M", 1000);

        int i = 0;
        int result = 0;
        while(i < s.length()){
            String s1 = s.substring(i, i+1);
            if(i == s.length() - 1) return result += values.get(s1);
            String s2 = s.substring(i, i+2);

            if(values.containsKey(s2)){
                result += values.get(s2);
                i+=2;
            }else{
                result += values.get(s1);
                i++;
            }
        }
        return result;
    }
}
