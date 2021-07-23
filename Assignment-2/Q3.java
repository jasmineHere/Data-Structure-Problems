import java.util.*;

public class PrintUppercaseLowercase {

    public static void PrintUpperOrLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Entered character is in UPPERCASE!");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Entered character is in LOWERCASE!");
        } else {
            System.out.println("Invalid Input!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        PrintUpperOrLowerCase(ch);
        sc.close();
    }
}
