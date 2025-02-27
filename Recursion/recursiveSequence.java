package Recursion;

public class recursiveSequence {
    static final int MOD = (int) 1e9 + 7;
    static long seriesSum(int calculated, 
                         int current, 
                         int N) 
    {
        int i;
        long cur = 1;
     
        // checking termination condition
        if (current == N + 1) 
            return 0;
     
        // product of terms till current
        for (  i = calculated; i < calculated + 
                                current; i++)
           
            cur*=i; 
           
     
        // recursive call for adding 
        // terms next in the series
        return (cur + seriesSum(i, current + 1, N))%MOD; 
    }
     
     
       
    

    public static void main(String[] args) {
        System.out.println(seriesSum(1,1,7));
        // System.out.println(123%100000+7);

    }

}
