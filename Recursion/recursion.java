package Recursion;

public class recursion {
    //print number in decreasing order
    
    static void decreasing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decreasing(n - 1);
    }
    

    static void increasing(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        increasing(n-1);

        System.out.print(n+" ");
    }

    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int f=factorial(n-1);
        int fn=n*f;

        return fn;
    }
    static int sumOfNatural(int n){
        if (n==0) {
            return 0;
        }
       
        int sum =n+sumOfNatural(n-1);
        return sum;
    }

    static int fibonacci(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fib=fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }

    static boolean isSortedArray(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSortedArray(arr,i+1);
    }

    static int findIndex(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return findIndex(arr, key, i+1);
    }

    static int lastoccurence(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound=lastoccurence(arr, key, i+1);

        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }

        // way1
        // int xpowern=calcPower(x,n-1);
        // int xn=x*xpowern;
        // return xn;
        // return x*calcPower(x, n-1);  

        // way2
        int halfPower=calcPower(x, n/2);
        int halfPowerSq=halfPower*halfPower;
        if (n%2!=0) {
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }
    
public static void main(String[] args) {
    int n=25;
    decreasing(n);
    System.out.println();
    increasing(n);
    System.out.println();
    System.out.println(factorial(5));
    System.out.println(sumOfNatural(3));
    System.out.println(fibonacci(n));

    int arr[]={1,2,3,4,3,5};
    System.out.println(isSortedArray(arr,0));
    System.out.println(findIndex(arr,3,0));
    int arrr[]={5,5,6,5,4,5};
    System.out.println(lastoccurence(arrr, 8, 0));
    System.out.println(calcPower(2, 4));
}
}
