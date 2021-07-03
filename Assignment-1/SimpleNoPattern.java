public class SimpleNoPattern {

    public static void pattern(int n) {
        int id = 1, nst = 1;
        while (id <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print(cst + " ");
                cst++;
            }
            System.out.println();
            nst++;
            id++;
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }

}
