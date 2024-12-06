
public class asssignment {
    public static int maxWater(int height[]){
        int n=height.length;

        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

         int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        int waterlevel=0;
        int MaxWater=0;
        for(int i=0;i<n;i++){
            waterlevel=Math.min(leftMax[i],rightMax[i]);
            MaxWater+=waterlevel-height[i];
        }
        return MaxWater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(height));
    }
}
