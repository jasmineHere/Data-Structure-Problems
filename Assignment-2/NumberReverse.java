import java.util.*;

public class NumberReverse {

    public static int NumberReverseProb(int n) {
        int ans = 0, temp = 0;
        while (n != 0) {
            ans = ans * 10 + n % 10;
            if (temp != (ans - (n % 10)) / 10) {
                System.out.println("Integer gone out of range");
                ;
                return 0;
            }
            temp = ans;
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int res = NumberReverseProb(n);
        System.out.print("Reverse of number: " + res);
        sc.close();
    }
}
