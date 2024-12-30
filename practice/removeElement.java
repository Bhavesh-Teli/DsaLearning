

import java.util.Arrays;

public class removeElement {
    static int fn(int[] a) {
        int k = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[k - 1]) {
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }
    // static void arr(int [] a){
    // for (int i = 0; i < a.length; i++) {
    // System.out.print(a[i]+ " ");
    // }
    // }

    public static void main(String[] args) {
        int[] num = { 1, 1, 2, 4, 5, 8, 8, 9, 9, 9 };
        int val = 3;
        int k = fn(num);
        System.out.println(k);
 System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(num, k)));
    }
}