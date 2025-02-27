package Recursion;

import java.util.ArrayList;
import java.util.*;

public class recamnsSequence {
    static void recamns(int n, int idx, int result) {
        if (idx == 0) {
            System.out.println(0);
            recamns(n, idx + 1, result);
            return;
        }
        if (idx == n) {

            return;
        }
        int res = 0;
       

            res = result - idx; 
            if (res < 0 || res==0) {
                res = result + idx;
            }
        

        System.out.println(res);
        recamns(n, idx + 1, res);
    }

      static ArrayList<Integer> helper(int n,int idx  ,int result,HashSet<Integer> seen){
        ArrayList<Integer> s=new ArrayList<>();
       
        if(idx == n){
            return s;
        }
        
        int  res=result-idx;
        
        if(res<0 || seen.contains(res)){
            res=result+idx;
            
        }
        seen.add(res);
        s.add(res);
        s.addAll(helper( n, idx+1  , res, seen));
        return s;
          
    }
    static ArrayList<Integer> recamanSequ(int n){
        // code here
        return helper(n, 0, 0, new HashSet<>());
    }
    public static void main(String[] args) {
        recamns(5, 0, 0);
        ArrayList<Integer> s=recamanSequ(5);
        System.out.println(s);
    }
}
