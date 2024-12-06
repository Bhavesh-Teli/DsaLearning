package Sorting;
//in this technique it take either max or small element and push it starting and so on


public class SelectionSort {

    public static void selectionSort(int arr[]){
       for (int i = 0; i < arr.length-1; i++) {
        int minPos=i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
       }
        }
       
        
    
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={5,4,1,45,87,7,5,2,5,6,4,83,2};
        selectionSort(arr);
        printArr(arr);
    }
}
 