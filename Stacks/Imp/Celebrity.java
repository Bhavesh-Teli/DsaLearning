package Imp;

import java.util.Stack;

public class Celebrity {
    public static int celebrity(int M[][], int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size()>1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if (M[v1][v2]==0) {
                st.push(v1);
            }
            else if(M[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return-1;
        int potential=st.pop();
        for (int j = 0; j < M.length; j++) {
            if(M[potential][j]==1) return-1;
        }
        for (int j = 0; j < M.length; j++) {
            if(j==potential) continue;
            if(M[j][potential]==0) return-1;
        }
        return potential;

    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 1, 0 },
                        { 0, 0, 1, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 1, 0 } };

        System.out.println(celebrity(mat, mat.length));
    }
}
