public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;
       
        while (a < b) {
            int twinSum = nums[a] + nums[b];
            if (twinSum == target) {

                return new int[] { a, b };
            } else if (twinSum > target) {
                b--;
            } else if (twinSum < target) {
                a++;
            }
        }
        return new int[] {};

    }

    public static int[] twoS(int[] a,int target){

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j]==target){
                    int [] b={i,j};
                    return b;
                }
              
            }
        }int c[]={};
        return c;
    }
    public static void main(String[] args) {
        int a[]={3,2,4};
        // int[] result = twoSum(a, 6);
        // System.out.println("Indices: " + result[0] + ", " + result[1]);
        int[] res = twoS(a, 7);
        System.out.println("Indices: " + res[0] + ", " + res[1]);
    }
}
