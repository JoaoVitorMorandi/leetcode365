import java.util.HashMap;
import java.util.Map;

public class ShortestWordDistance {

    public static void main(String[] args) {
        String res = shortestWordDistance(new String[]{"opa", "porta", "madeira", "opa", "janela", "madeira", "porta", "janela", "Teste", "Teste"});
        System.out.println(res);
    }

    public static String shortestWordDistance(String[] words) {

        Map<String, Integer> map = new HashMap<>();
        int shortestDistance = Integer.MAX_VALUE;
        String shortestWord = null;

        for(int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){
                int distance = i - map.get(words[i]);
                map.put(words[i], distance);
                if(distance < shortestDistance){
                    shortestDistance = distance;
                    shortestWord = words[i];
                }
            } else {
                map.put(words[i], i);
            }
        }

        return shortestWord;
    }
}
