package DivideAndConquer;

public class inversionCount {
   static int mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return 0;
        }
        int invCount=0;
        int mid=si+(ei-si)/2;

        invCount=mergeSort(arr, si, mid);
        invCount+=mergeSort(arr, mid+1, ei);
        invCount+=merge(arr, si,mid+1, ei);

        return invCount;

    }
    static int merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid;
        int invCount=0;
        int k=0;
        int temp[]=new int[ei-si+1];

        while(i<mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;
                invCount+=(mid-i);
            }
        }

        while(i<mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for ( i = si,k=0; i <=ei; k++,i++) {
            arr[i]=temp[k];
        }
        return invCount;
    }
    static void inversionCnt(int arr[]){
        int count=mergeSort(arr,0,arr.length-1);
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4,6,7,9,98};
        inversionCnt(arr);
    }
    
}
