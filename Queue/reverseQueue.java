package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static Queue reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        return q;

    }

    public static  Queue<Integer> reverseK(Queue<Integer> q, int n) {
       
        if (q == null || n <= 0 || n > q.size()) {
            return q; // Return the queue as is if invalid input
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        System.out.println(q.size());
        int remaining = q.size() - n;
        for (int i = 0; i < remaining; i++) {
            q.add(q.remove());
        }

        return q;

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.add(5);
        q.add(6);
        System.out.println(q);

        reverseK(q, 3);
        System.out.println(q);

    }
}
