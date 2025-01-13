import java.util.Stack;

public class largestRectHistogram {

    public static int[] nextSmaller(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (arr[st.peek()] >= arr[i] && !st.isEmpty()) {
                st.pop();
            }
            if (!st.isEmpty())
                res[i] = -1;
            else
                res[i] = arr[st.peek()];
            st.push(i);
        }
        return res;
    }

    public static int largestRect(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        st.push(n - 1);
        nse[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                nse[i] = n;
            else
                nse[i] = st.peek();
            st.push(i);
        }

        while (st.size() > 0)
            st.pop();

        st.push(0);
        pse[0] = -1;
        for (int i = 1; i <= n - 1; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                pse[i] = -1;
            else
                pse[i] = st.peek();
            st.push(i);
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            int area=heights[i]*(nse[i]-pse[i] -1);
            max=Math.max(max,area);
        }
        for (int i = 0; i < nse.length; i++) {
            System.out.print(nse[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < pse.length; i++) {
            System.out.print(pse[i]+" ");
        }
        System.out.println();
        return max;
    }
    public static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nse[]=new int[n];
        int pse[]=new int[n];
  
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        nse[n-1]=n;
  
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
        if(st.isEmpty()) nse[i]=n;
        else nse[i]=st.peek();
        st.push(i);
        }
        while(!st.isEmpty()) st.pop();
  
        pse[0]=-1;
        st.push(0);
  
        for(int i=1;i<n;i++){
          while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
              st.pop();
          }
          if(st.isEmpty()) pse[i]=-1;
          else pse[i]=st.peek();
          st.push(i);
        }
  
        int max=-1;
        for(int i=0;i<n;i++){
          int area=heights[i]*(nse[i]-pse[i]-1);
          max=Math.max(max,area);
  
        }
        for (int i = 0; i < nse.length; i++) {
            System.out.print(nse[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < pse.length; i++) {
            System.out.print(pse[i]+" ");
        }
        return max;
        
  }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 5, 9 };
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    res[i] = j;
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
      System.out.println(largestRect(arr));
      System.out.println();
      System.out.println(largestRectangleArea(arr));
    }
}
