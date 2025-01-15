public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums ={0,1,0,3,12};
        int n=nums.length;
        int left=0,right=0;

        while(right<n){
            if(nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
            right++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
