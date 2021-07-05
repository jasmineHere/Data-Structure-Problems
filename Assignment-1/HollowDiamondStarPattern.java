import java.util.*;

public class HollowDiamondStarPattern {

    public static void Pattern(int n) {
        int id = 1, nst = n, nsp = 1;
        while (id <= 2 * n - 1) {
            int cst = 1;
            if (id == 1 || id == 2 * n - 1) {
                while (cst <= 2 * nst - 1) {
                    System.out.print("* ");
                    cst++;
                }
                nsp -= 2; // Without it, pattern is taking up extra nsp
            } else {
                cst = 1;
                while (cst <= nst) {
                    System.out.print("* ");
                    cst++;
                }
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print("  ");
                    csp++;
                }
                cst = 1;
                while (cst <= nst) {
                    System.out.print("* ");
                    cst++;
                }
            }
            System.out.println();
            if (id < n) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            id++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Pattern(n);
        sc.close();
    }
}
