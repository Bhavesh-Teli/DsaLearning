package DivideAndConquer;

public class pracSheet {

    // question 1 sorting according to
    static String[] mergeSort(String arr[], int si, int ei) {
        if (si == ei) {
            String[] A = { arr[si] };
            return A;
        }
        int mid = si + (ei - si) / 2;
        String[] arr1 = mergeSort(arr, si, mid);
        String[] arr2 = mergeSort(arr, mid + 1, ei);

        String[] arr3 = merge(arr1, arr2);
        return arr3;

    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;
        int idx = 0;
        String temp[] = new String[m + n];

        while (i < m && j < n) {
            if (isAlphabaticalyTrue(arr1[i], arr2[j])) {
                temp[idx] = arr1[i];
                i++;
                idx++;
            } else {
                temp[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while (i < m) {
            temp[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            temp[idx++] = arr2[j++];
        }

        return temp;
    }

    static boolean isAlphabaticalyTrue(String a, String b) {
        if (a.compareTo(b) < 0) {
            return true;
        } else {
            return false;
        }
    }

    ///return majority elemment

    static int majorityElement(int arr[]) {
        
        int num= majorityElem(arr, 0, arr.length - 1);
        int count =coutnElem(arr, num, 0, arr.length-1);
        if(count>=arr.length/2){
            return num;
        }else{
            return -1;
        }
    }

    static int majorityElem(int arr[], int si, int ei) {
        if (si == ei) {
            return arr[si];
        }

        int mid = si + (ei - si) / 2;
        int left = majorityElem(arr, 0, mid);
        int right = majorityElem(arr, mid + 1, ei);

        if (left == right) {
            return left;
        }

        int rightCount = coutnElem(arr, right, si, mid);
        int leftCount = coutnElem(arr, left, mid + 1, ei);

        return rightCount > leftCount ? right : left;
    }

    static int coutnElem(int arr[], int num, int si, int ei) {
        int count = 0;
        for (int i = si; i < ei; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // question 2
        System.out.println();
        int arr1[] = { 2, 33, 3,3,34,3,6,7,8,9, 4, 2, 2 };
        System.out.println("majority elem " + majorityElement(arr1));

    }
}
