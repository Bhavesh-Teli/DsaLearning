package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums,int target){
        int n=nums.length;
        int[] ans={-1};

        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner=target-nums[i];
            if (mp.containsKey(partner)) {
                ans=new int[] {mp.get(partner),i};
                return ans;
            }
            mp.put(nums[i],i);
        }
       return ans;
    }
    public static void main(String[] args) {
       
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] result = twoSum(a, 9);

        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
