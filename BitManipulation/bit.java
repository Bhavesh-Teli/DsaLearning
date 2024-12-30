package BitManipulation;

public class bit {
    public static void oddEve(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {

            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    static int setIBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    static int clearIBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    static int updateIBit(int n, int i,int newBit) {
        // if (newBit == 0) {
        //     return clearIBit(n, i);
        // } else{
        //     return setIBit(n, i);
        // }
        
        n=clearIBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }

    static int clearlasts(int n, int i) {
        int bitMask = ~(0)<<i;
        return n & bitMask;
    }
    static int clearinRange(int n, int i,int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }

    //check is number is power of 2
    static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }
    static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if ((n  & 1 )!=0 ){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    
    public static void main(String[] args) {
        getIthBit(10, 2);
        oddEve(9);
        System.out.println(clearIBit(10, 1));
        System.out.println(updateIBit(10,2, 1));
        System.out.println(clearlasts(15,2));
        System.out.println(clearinRange(10,2,4));
        System.out.println(clearinRange(10,2,4));
        System.out.println(isPowerofTwo(64));
        System.out.println(isPowerofTwo(64));
        System.out.println(countSetBits(15));
    }  
}
