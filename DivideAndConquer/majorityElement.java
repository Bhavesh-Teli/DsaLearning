package DivideAndConquer;

public class majorityElement {

    // Function to count occurrences of a specific number (num) in a range [si, ei]
    static int countInRange(int nums[], int num, int si, int ei) {
        int count = 0;
        // Iterate through the range [si, ei]
        for (int i = si; i <= ei; i++) {
            if (nums[i] == num) { // If nums[i] matches the target number
                count++;          // Increment the count
            }
        }
        return count; // Return the total count
    }

    // Recursive function to find the majority element in a subarray [si, ei]
    static int majorityElem(int num[], int si, int ei) {
        // Base case: If the subarray contains only one element, return that element
        if (si == ei) {
            return num[si];
        }

        // Divide: Find the midpoint of the current subarray
        int mid = si + (ei - si) / 2;

        // Recursively find the majority element in the left half
        int left = majorityElem(num, si, mid);

        // Recursively find the majority element in the right half
        int right = majorityElem(num, mid + 1, ei);

        // Conquer: If both halves have the same majority element, return it
        if (left == right) {
            return left;
        }

        // Count the occurrences of the left and right candidates in the current range
        int leftCount = countInRange(num, left, si, ei);
        int rightCount = countInRange(num, right, si, ei);

        // Return the element with the higher count
        return leftCount > rightCount ? left : right;
    }

    // Wrapper function to find the majority element in the entire array
    static int majorityElement(int nums[]) {
        int candidate = majorityElem(nums, 0, nums.length - 1);
        int count = countInRange(nums, candidate, 0, nums.length - 1);
        if (count > nums.length / 2) { // Validate if it satisfies the majority condition
            return candidate;
        } else {
            return -1; // Indicate no majority element exists
        }
    }

    public static void main(String[] args) {
        // Example input array
        int nums[] = { 2,6,7,8, 1,5,5  };

        // Output the majority element
        System.out.println(majorityElement(nums));
    }
}
