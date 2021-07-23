import java.util.*;

public class NumberReverse {

    public static void numberReverse(int n) {
        int ans = 0;
        while (n != 0) {
            ans = ans * 10 + (n % 10);
            n = n / 10;
        }
        System.out.print("Reverse: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        numberReverse(n);
        sc.close();
    }
}
