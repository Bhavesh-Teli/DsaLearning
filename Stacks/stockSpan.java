import java.util.ArrayList;
import java.util.Stack;

public class stockSpan {

    public static int[] stockSpan(int arr[]) {

        int res[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < res.length; i++) {
            while (arr[st.peek()] >= arr[i] && !st.isEmpty()) {
                st.pop();
            }
            if (st.isEmpty())
                res[i] = i + 1;
            else
                res[i] = i - st.peek();
            st.push(i);
        }
        return res;
    }

    public static ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

      Stack<Integer> st = new Stack<>();
      for (int i = 0; i < arr.length; i++) {
          while ( arr[st.peek()] <= arr[i] && !st.isEmpty()) {
              st.pop();
          }
          if (st.isEmpty())
              res.add(i + 1);
          else
              res.add(i - st.peek());
          st.push(i);
      }
      return res;
      // write code here
  }
    public static void main(String[] args) {
        int stock[] = { 100, 80, 60, 70, 60, 75, 85 };
        int[] res = new int[stock.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }

        for (int i = 1; i < res.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (stock[i] >= stock[j]) {
                    res[i]++;
                } else {
                    break; // Stop if a higher stock price is encountered
                }

            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        for (int num : res) {
            System.out.print(num + " ");
        }

        ArrayList<Integer> span =calculateSpan(stock);
        System.out.println("Span values: ");
        for (int sp : span) {
            System.out.print(sp + " ");
        }
        System.out.println();
    }
}
