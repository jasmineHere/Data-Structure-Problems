import java.util.*;

public class CharacterInputProb {

    public static void Calculation(int num1, int num2, char ch) {
        if (ch == '*') {
            System.out.println(num1 * num2);
        } else if (ch == '/') {
            System.out.println(num1 / num2);
        } else if (ch == '%') {
            System.out.println(num1 % num2);
        } else if (ch == '+') {
            System.out.println(num1 + num2);
        } else if (ch == '-') {
            System.out.println(num1 - num2);
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers and a mathematical operation to be applied on numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char ch = sc.next().charAt(0);
        Calculation(n1, n2, ch);
        sc.close();
    }
}
