import java.util.*;

public class GCDProb {

    public static void calculateGCD(int a, int b) {
        int GCD = 0;
        if (a == 0 || b == 0) {
            GCD = Math.max(a, b);
        } else {
            for (int i = Math.min(a, b); i > 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    GCD = i;
                }
            }
        }
        System.out.println("Calculated GCD: " + GCD);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two numbers to find their GCD: ");
        a = sc.nextInt();
        b = sc.nextInt();
        calculateGCD(a, b);
        sc.close();
    }
}
