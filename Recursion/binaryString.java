package Recursion;

public class binaryString {
    static void binStr(int n,int lastplace,String str){
       if(n==0){
        System.out.println(str);
        return;
       }
        // if(lastplace==0){
        //     binStr(n-1, 0, str.append("0"));
        //     binStr(n-1, 1, str.append("1"));
        // } else{
        //     binStr(n-1, 0, str.append("0"));
        // }

        binStr(n-1, 0, str+"0");
        if (lastplace==0) {
            binStr(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binStr(3, 0, "");
    }
}
