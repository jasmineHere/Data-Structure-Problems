import java.util.*;

public class Count5Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to store in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 5 == 0) {
                count++;
            }
        }
        System.out.println("Count of multiples of 5 in an array: " + count);
        sc.close();
    }
}
