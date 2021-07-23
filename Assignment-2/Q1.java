import java.util.*;

public class DecimalBinaryConversions {

    public static void DecimaltoAny(int num, int base) {

        if (base == 16) {
            String ans = "";
            char[] hexadecimal = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
            int rem = 0;
            while (num != 0) {
                rem = num % base;
                ans = ans + hexadecimal[rem];
                num = num / base;
            }
            System.out.println("Decimal to " + base + "-base conversion is:" + ans);
        } else {
            int ans = 0;
            double p = 0;
            while (num != 0) {
                ans = ans + ((int) Math.pow(10, p) * (num % base));
                num = num / base;
                p++;
            }
            System.out.println("Decimal to " + base + "-base conversion is:" + ans);
        }
    }

    public static void AnytoDecimal(int num, int base) { // only works for binary and octal base
        int ans = 0;
        double p = 0;
        while (num != 0) {
            ans = ans + ((int) Math.pow(base, p) * (num % 10));
            num = num / 10;
            p++;
        }
        System.out.println(base + "-base to decimal conversion is: " + ans);
    }

    public static void main(String[] args) {
        DecimaltoAny(453, 8);
        // AnytoDecimal(101, 2);
    }
}
