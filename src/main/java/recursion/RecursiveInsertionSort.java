public class RecursiveInsertionSort {

    private static void insertionSort(int[] arr, int n){
        if (n <= 1)
            return;
        insertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while(j>=0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[arr + 1] = last;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        insertionSort(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}