import java.util.*;

public class GCD {

    public static int findGCD(int n1, int n2) {
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos to calculate their GCD: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = findGCD(n1, n2);
        System.out.println("Calculated GCD: " + gcd);
        sc.close();
    }

}
