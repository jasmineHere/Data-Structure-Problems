import java.util.*;

public class SpiralNumberPattern {

    public static void pattern(int n) {
        int id = 1, nst = 1, nsp = 2 * n - 3, tempsp = n;
        while (id <= 2 * n - 1) {
            int cst = 1, temp = n;
            if (id == n) {
                while (cst <= 2 * nst - 1) {
                    System.out.print(temp + " ");
                    if (cst < n) {
                        temp--;
                    } else {
                        temp++;
                    }
                    cst++;
                }
            } else {
                temp = n;
                cst = 1;
                while (cst <= nst) {
                    System.out.print(temp + " ");
                    cst++;
                    temp--;
                }

                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(tempsp + " ");
                    csp++;
                }
                temp++;
                cst = 1;
                while (cst <= nst) {
                    System.out.print(temp + " ");
                    cst++;
                    temp++;
                }
            }
            System.out.println();
            if (id < n) {
                nst++;
                nsp -= 2;
                tempsp--;
            } else {
                nst--;
                nsp += 2;
                tempsp++;
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
