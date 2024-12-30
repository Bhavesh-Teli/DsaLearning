
public class sorting {
    static void buubblesort(int[] a) {
        for (int turn = 0; turn < a.length - 1; turn++) {
            for (int j = 0; j < a.length - 1 - turn; j++) {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }

        }

    }

    static void selectionSort(int a[]){
        for (int i = 0; i < a.length; i++) {
             int minindex=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[minindex]<a[j]){
                    minindex=j;
                }
            }
            if (minindex!=i) {
                int temp=a[i];
                a[i]=a[minindex];
                a[minindex]=temp;
            }
        }
        

    }

    static void insertionSort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int curr=a[i];
            int prev=i-1;
            while (prev>=0 && a[prev]>curr) {
                a[prev+1]=a[prev];

                prev--;
            }
            a[prev+1]=curr;
        }
       
    }
    static void arr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 5, 2, 06, 3, 7, 90 };
        // buubblesort(a);
        // selectionSort(a);
        insertionSort(a);
        arr(a);
    }
}
