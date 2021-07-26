import java.util.*;

public class PascalTriangleProblem {

    public static int findCombination(int n, int r) {
        int i = 1, C = 1;
        while (i <= r) {
            if (r == 0) {
                return 1;
            } else {
                C = C * (n - i + 1) / i; /* try the formula of nCr and nCr-1 and try to equate both, hence this equation
                                         can be derived */
            }
            i++;
        }
        return C;

    }

    public static void printPattern(int n) {
        int id = 1, nst = 1;
        System.out.println("1");
        while (id <= n - 1) {
            int cst = 0;
            while (cst <= nst) {
                System.out.print(findCombination(nst, cst) + " ");
                cst++;
            }
            System.out.println();
            id++;
            nst++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
