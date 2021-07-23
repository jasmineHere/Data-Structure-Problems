public class Sorting01 {

  public static void main(String[] args) {
    int[] arr = { 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1 };
    for (int j = 1; j < arr.length; j++) {
      int key = arr[j];
      int i = j - 1;
      while (i >= 0 && arr[i] > key) {
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = key;
    }
    System.out.println("Sorted array:");
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
  }
}
