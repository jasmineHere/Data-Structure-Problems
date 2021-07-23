import java.util.Scanner;

public class EvenOddJumpProb {

    public static void evenOddJump(int n) {
        int evenNum = 2, i = 1;
        while (i <= n) {
            System.out.print(evenNum + " ");
            evenNum = evenNum + 4 * i; // odd times jump(4*i)
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        evenOddJump(n);
        sc.close();
    }
}
