import java.util.*;

public class sum {

    public static int PrintSum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = n + PrintSum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = PrintSum(n);
        System.out.println(ans);
        sc.close();
    }
}
