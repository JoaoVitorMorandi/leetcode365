import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RepeatedNumbers {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,4};
        int[] b = new int[]{2,3,4};
        System.out.println(Arrays.toString(intersection(a,b)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        int[] used = null;
        int[] notUsed = null;
        if(nums1.length > nums2.length) {
            used = nums1;
            notUsed = nums2;

        } else {
            used = nums2;
            notUsed = nums1;
        }

        for(int i = 0; i < used.length; i++){
            set.add(used[i]);
        }

        for(int j = 0; j < notUsed.length; j++){
            if(set.contains(notUsed[j])){
                result.add(notUsed[j]);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
