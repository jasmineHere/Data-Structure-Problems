import java.util.*;

public class LCM {
    public static int findLCM(int n1, int n2) {
        int on1 = n1, on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int lcm = (on1 * on2) / n2;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos to calculate their LCM: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm = findLCM(n1, n2);
        System.out.println("Calculated LCM: " + lcm);
        sc.close();
    }
}
