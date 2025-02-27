package HashSet;

import java.util.HashSet;

public class longestConsecutive {
    public static int longest(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums)
            st.add(num);
        int maxStreak = 0;
        for (int num : st) {
            if (!st.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;
                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        int num[] = { 1, 5, 6,  2, 3, 16, 15, 14, 13, 2, 4 };
        System.out.println(longest(num));
    }
}
