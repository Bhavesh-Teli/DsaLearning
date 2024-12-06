

public class TrappingRainwater {
    public static int fn(int[] height){
        int n=height.length;
        int trappedWater=0;

        //max-Left
        int maxLeft[]=new int[n];
        maxLeft[0]=height[0];
        for (int i = 1; i <n; i++) {
            maxLeft[i]=Math.max(maxLeft[i-1],height[i]);
        }
        int maxRight[]=new int[n];
        maxRight[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            maxRight[i]=Math.max(maxRight[i+1],height[i]);
        }
        for (int i = 0; i < maxRight.length; i++) {
            int waterlevel=Math.min(maxLeft[i], maxRight[i]);

            trappedWater+=waterlevel-height[i];
        }
        
        return trappedWater;
    }
    public static void main(String[] args) {
        int [] height={4,2,0,6,3,2,5};
        System.out.println(fn(height));
    }
}
