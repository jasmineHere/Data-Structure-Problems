import java.util.*;

public class InverseOfNo {

    public static int CountLength(int num) {
        int c = 0;
        while (num != 0) {
            c++;
            num = num / 10;
        }
        return c;
    }

    public static boolean ValidOrInvalid(int num) {
        int count = CountLength(num);
        int digit = 0;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        while (num != 0) {
            digit = num % 10;
            if (digit < 0 || digit > count) {
                return false;
            }
            arr[digit - 1] += 1;
            num = num / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static void CalculatingInverse(int num) {
        int res = 0;
        int count = CountLength(num);
        int[] arr = new int[count];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }

        int[] temparr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            temparr[arr[i] - 1] = i + 1;
        }

        for (int i = 0; i < temparr.length; i++) {
            res = res * 10 + temparr[i];
        }
        System.out.println("Inverse of number: " + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (ValidOrInvalid(n)) {
            CalculatingInverse(n);
        } else {
            System.out.println("ERROR! for calculating inverse, you should have a valid input");
            System.out.println("Eg: for a number of n digits, the value of each digit should be 1 to n and unique");
        }
        sc.close();
    }
}
