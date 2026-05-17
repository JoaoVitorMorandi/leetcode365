import java.util.HashSet;

public class FirstDuplicateNumber {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,4};
        System.out.println(fistRepeatedNumber(array));
    }

    public static int fistRepeatedNumber(int[] array){
        HashSet<Integer> set = new HashSet<>();
        for (int j : array) {
            if (set.contains(j)) {
                return j;
            }
            set.add(j);
        }
        return -1;
    }
}
