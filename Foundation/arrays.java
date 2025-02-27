package Foundation;
public class arrays {

    public static void linearSearch() {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 1;
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                System.out.println(i);
                return;
            }
        }
    }

    public static void linearSearchlargest() {
        int num[] = { 1, 2, 3, 15, 5, 6, 7, 8, 9, 10 };
        int n = Integer.MIN_VALUE;
        int k = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > n) {
                n = num[i];
            }
            if (num[i] < k) {
                k = num[i];
            }
        }
        System.out.println(n);
        System.out.println(k);
    }

    public static int bnarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;

        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }

    }

    public static void pairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subarray(int num[]) {
        int ts = 0;
        for (int i = 0; i < num.length; i++) {

            for (int j = i; j < num.length; j++) {
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println("]");
            }

        }

    }

    public static void findAllSubarrays(int[] arr) {
        int n = arr.length;

        System.out.println("All subarrays:");
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print subarray from index 'start' to 'end'
                System.out.print("[ ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("]");
            }
        }
    }

    public static void maxSubArray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {

                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.print("]");

            }
            System.out.println();
        }
        System.out.println("max" + maxSum);

    }

    public static void kadanes(int[] arr) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            } else {
                ms = cs;
            }
        }

        System.out.println(ms);
    }

    public static void sa(int[] arr) {
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                currSum += arr[j];
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.print("]");
                if (currSum > ms) {
                    ms = currSum;
                }
            }
            System.out.println();
        }
        System.out.println(ms);
    }

    public static void kadan(int[] arr) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs > ms) {
                ms = cs;
            }
            if (cs < 0) {
                cs = 0;
            }
        }
        System.out.println("Max subarray sum: " + ms);
    }

    public static void main(String[] args) {
        // linearSearchlargest();
        int a[] = { 2, 45, 656, 46, 345, 35, 77, 432, 2 };
        int b[] = { 1, 2, -5, 3, 4 };
        kadan(b);
        // System.out.println(bnarySearch(a,45));
        // reverse(a);
        // pairs(b);
        // subarray(b);
        // maxSubArray(b);
        // kadanes(a);
        // findAllSubarrays(b);
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i]+ " ");
        // }
        // System.out.println();
        // sa(b);

    }
}
