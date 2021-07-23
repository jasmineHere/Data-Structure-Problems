public class InsertionSort {
    public static void SortedOrNot(int arr[]) {
        boolean isSorted = true;
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                isSorted = false;
                break;
                // arr[i + 1] = arr[i];
                // i--;
            }
            arr[i + 1] = key;
        }
        if (isSorted) {
            System.out.println("Given array is sorted");
        } else {
            System.out.println("Given array is not sorted");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        SortedOrNot(arr);
    }
}
