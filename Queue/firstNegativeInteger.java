package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeInteger {
    public static long[] printFirstNegative(long arr[], int n, int k) {
        long[] res = new long[n - k + 1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < res.length; i++) {
            if (arr[i]<0) {
                q.add(i);
            }
        }
        for (int i = 0; i < n-k+1; i++) {
            if (q.size()>0 &&  q.peek()<i) q.remove();
             if (q.size()>0 && q.peek()<=i+k-1) {
                res[i]=arr[q.peek()];
            }
             else if(q.size()==0) res[i]=0;
             else res[i]=0;
        }
        return res;
    }

    public static void main(String[] args) {
        long arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        long a[]=printFirstNegative(arr, arr.length, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
