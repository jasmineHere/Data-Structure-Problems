public class ArrayReverse {

    public static void Reverse(int[] arr) {
        int low = 0, high = arr.length - 1, temp = 0;
        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println("Array reverse:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 45, 60, 23, 49, 38 };
        Reverse(arr);
    }
}
