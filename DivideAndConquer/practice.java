package DivideAndConquer;

public class practice {

    static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // quick sort

    static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pdx = partition(arr, si, ei);
        quickSort(arr, si, pdx - 1);
        quickSort(arr, pdx + 1, ei);

    }

    static int partition(int arr[], int si, int ei) {
        int i = si - 1;
        int pviot = arr[ei];

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pviot) {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pviot;

        return i;
    }

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // search in roteted sorted array

    static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <=arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <=arr[mid]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }

    };

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
        // mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length - 1);
        // printarr(arr);

        int ar[] = { 3, 4, 5, 7, 0, 1, 2 };
        int target = 2;
        System.out.println(search(ar, target, 0, ar.length - 1));
    }
}
