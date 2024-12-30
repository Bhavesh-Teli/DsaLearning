package Recursion;

import String.palindrome;

public class friendsParing {
    static int friendspair(int n){
        if (n==1 || n==2) {
            return n;
        }
        // int fnm1=friendspair(n-1);

        // int fnm2=friendspair(n-2);
        // int pairWays=(n-1)*fnm2;

        // int totalWays=fnm1+pairWays;
        // return totalWays;

        //one liner
        return friendspair(n-1)+(n-1)*friendspair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendspair(3));
    }
}
