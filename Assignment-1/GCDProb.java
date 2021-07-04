import java.util.*;

public class GCDProb {

    public static void calculateGCD(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("Calculated GCD: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers to find their GCD: ");
        a = sc.nextInt();
        b = sc.nextInt();
        calculateGCD(a, b);
        sc.close();
    }
}
