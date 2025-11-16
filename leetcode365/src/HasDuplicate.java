import java.util.HashSet;
import java.util.Set;

public class HasDuplicate {

    public static void main(String[] args) {
        boolean res = hasDuplicate(new int[]{1,12,7,4,5,1});
        System.out.println(res);
    }

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet();

        for(int i : nums){
            if(numsSet.contains(i)){
                return true;
            }
            numsSet.add(i);
        }
        return false;
    }
}
