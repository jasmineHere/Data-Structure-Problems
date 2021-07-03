public class FirstTraingleNoPattern {

    public static void pattern(int n) {
        int id = 1, nst = 1, nsp = n - 1;
        while (id <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1, temp = 1;
            while (cst <= nst) {
                System.out.print(temp + " ");
                if (cst < id) {
                    temp++;
                } else {
                    temp--;
                }
                cst++;
            }
            System.out.println();
            nst += 2;
            nsp--;
            id++;
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
