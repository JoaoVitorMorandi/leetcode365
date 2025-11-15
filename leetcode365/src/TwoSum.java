import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{1,12,7,4,5},  9);
        for(int i : res){
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(numsMap.containsKey(diff)){
                return new int[]{numsMap.get(diff), i};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }

}




