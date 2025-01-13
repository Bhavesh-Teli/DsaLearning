import java.util.Stack;

public class nextGreaterElem {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length - 1;
        int res[] = new int[arr.length];
        // res[n] = -1;
        Stack<Integer> st = new Stack<>();
        
        for (int i = n; i >=0; i--) {
            while (st.peek()<=arr[i] && !st.isEmpty()) {
                st.pop();
            }
            if(st.isEmpty()) res[i] =-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
