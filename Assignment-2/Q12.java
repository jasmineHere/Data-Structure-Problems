public class OddEvenSort {

    public static int[] EvenOddSort(int arr[]) {
        int i = 0, j = i + 1, temp = 0;
        while (j < arr.length) {
            if (arr[i] % 2 != 0) {
                if (arr[j] % 2 == 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                } else {
                    j++;
                }
            } else {
                i++;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 5, 13, 6, 12, 18, 5 }; // ans: {8,6,12,18,3,5,13,5}
        int[] ans = EvenOddSort(arr);
        System.out.println("Even odd sorted array: ");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }

    }
}
