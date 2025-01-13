package Imp;

import java.util.Stack;

public class SlidingWindows {
    public static int[]  window(int[] nums,int k){
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int z=0;
        Stack<Integer> st=new Stack<>();
        int [] nge=new int[n];
        st.push(n-1);
        nge[n-1]=n;
        for (int i = n-2; i >=0; i--) {
            while (st.size()>=0 && nums[i]>nums[st.peek()]) st.pop();
            if(st.size()==0) nge[i]=n;
            else nge[i]=st.peek();
            st.push(i);
        }
        int j=0;
        for (int i = 0; i < n-k+1; i++) {
           if(j>=i+k) j=1;
            int max=nums[j];
            while(j<i+k){

                max = Math.max(max, nums[j]);
                j=nge[j];
                if (j >= i + k) break;
            }
            ans[z++]=max;
        }
        return ans;


    }
    public static void main(String[] args) {
    //   int[]  nums = {1,3,-1,-3,5,3,6,7};
      int[]  nums = {1,2,3,4,5,6,7,8};
      int k =3;
      int[] a = window(nums, k);
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i] + " ");
      }
    }
}
