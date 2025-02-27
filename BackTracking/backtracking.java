package BackTracking;

public class backtracking {

    static void changeArr(int arr[],int i,int val){
        if (i==arr.length) {
            print(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=val-2;
    }



    static void findSubSets(String str, String ans,int i  ){
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            } else{
                System.out.println(ans);
            }
            return;
        }
        findSubSets(str,  ans+str.charAt(i),i+1);
        findSubSets(str,  ans,i+1);
        
    }


    static void findPermutations(String str,String ans){
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);

          String  Newstr=str.substring(0, i)+str.substring(i+1);
          System.out.println(Newstr);
            findPermutations(Newstr, ans+curr);
        }
    }
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[]=new int[5];
       changeArr(arr, 0, 1);
       print(arr);
       

       String a="abc";
       findSubSets(a,  "",0);
       findPermutations(a, "");
    }
}
