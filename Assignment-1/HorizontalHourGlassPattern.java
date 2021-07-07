import java.util.*;

public class HorizontalHourGlassPattern {
    public static void pattern(int n) {
        int id = 1, nst = 1, nsp = 2 * n - 2;
        while (id <= 2 * n - 1) {

            int cst = 1;
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
            System.out.println();
            if (id < n) {
                nst++;
                nsp -= 2;
            } else {
                nst--;
                nsp += 2;
            }
            id++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
