public class MaxArea {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0;
        int f = height.length - 1;

        while(f > i){
            int water = (f - i) * Math.min(height[i], height[f]);
            if(water > maxWater) maxWater = water;
            if(height[i] < height[f]) i++;
            else f--;
        }
        return maxWater;
    }
}
