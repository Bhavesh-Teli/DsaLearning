public class bitPrac {
    static void swap(int a,int b){
        a = a ^ b;
        b = a ^ b; // Now b becomes the original value of a
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }

    //find ith bit is set(i) or not
    static void findSet(int n,int i){
        // int bitMask=1<<1;  //leftshift
        int bitMask=n>>i;
        if(( bitMask & 1)!=0){
           System.out.println("true");

        }
        else{
            System.out.println(false);
        }

        
    }

    static int toogle(int n,int i){
        int bitMask=1<<i;
        return n^bitMask;
    }

    static int removeRightSet(int n){
        int bitMask =n & n-1;
        return bitMask;
    }
    public static void main(String[] args) {
        swap(15, 16);
        findSet(13,6);
        System.out.println(toogle(13, 1));
        System.out.println(removeRightSet(15));
    }
}
