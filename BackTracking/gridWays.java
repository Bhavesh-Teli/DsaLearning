package BackTracking;

public class gridWays {
    
    static int gridway(int i,int j,int n,int m){
        if (i==n-1 && j==m-1) {
            return 1;
        } else if (i==n || j==n) {
            return 0;
        }

        int w1=gridway(i+1, j, n, m);
        int w2=gridway(i, j+1, n, m);
        return w1+w2;
    }


    static int  factorial(int num){
        if(num==0){
            return 1;
        }
        int fn=factorial(num-1);
        int fact=num*fn;
        return fact;
    }


    static int gridOptimized(int n,int m){
        int totalMoves=(n-1)+(m-1);
        // int downMoves=n-1;
        int ways=factorial(totalMoves)/(factorial(n-1)*factorial(m-1));
        return ways;
    }
    public static void main(String[] args) {
        int n=3;
        int a=n,b=n;
        
        System.out.println("optimized"+gridOptimized(n, b));
        System.out.println(factorial(5));
        System.out.println(gridway(0, 0, a, b));
    }
}
