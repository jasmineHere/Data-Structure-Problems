import java.util.*;

public class CountDigitsProb {

    public static void digitCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.print("Number of digits: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        digitCount(num);
        sc.close();
    }
}
