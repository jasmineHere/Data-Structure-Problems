import java.util.Scanner;

public class DiamondStarPattern {

    public static void Pattern(int n) {
        int id = 1, nst = 1, nsp = n - 1;
        while (id <= 2 * n - 1) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if (id < n) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
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
