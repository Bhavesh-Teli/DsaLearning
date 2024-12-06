public class prac {
    public static void fn(int[] nums, int target) {
        int n = nums.length;
        int issum = 0;
        ;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int t = nums[i] + nums[j];
                if (t == target) {

                    issum = i;
                }
            }
            System.out.println(issum);
        }

    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
       fn(height,6);
    }
}
