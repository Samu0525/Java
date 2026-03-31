public class quicksort {

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public static void QS(int[] arr, int start, int end) {
        if (start < end) {
            int pividx = partition(arr, start, end);
            QS(arr, start, pividx - 1);
            QS(arr, pividx + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, 8, 3};
        QS(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}