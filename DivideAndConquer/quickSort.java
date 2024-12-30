package DivideAndConquer;

import Recursion.recursion;

public class quickSort {
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void quickSrt(int arr[], int si, int ei) {
        if (si > ei) {
            return;
        }
        // last element
        int pidx = partition(arr, si, ei);
        quickSrt(arr, si, pidx - 1);
        quickSrt(arr, pidx + 1, ei);

    }

    static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }


    
    public static void main(String[] args) {
        int arr[]={2,6,3,9,8,2,5};
        quickSrt(arr, 0, arr.length-1);
        printArr(arr);
    }
}