import java.util.*;

public class CampusLeaderProblem {

    public static void displayBadge(int credits) {
        System.out.print("Badge of the campus leader: ");
        if (credits >= 7500) {
            System.out.print("Tera leader");
        } else if (credits >= 6000 && credits < 7500) {
            System.out.print("Gega leader");
        } else if (credits >= 4500 && credits < 6000) {
            System.out.print("Mega leader");
        } else if (credits < 4500) {
            System.out.print("Rising Star");
        } else {
            System.out.print("Invalid Input");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credits of Code For Cause Campus Leader: ");
        int credits = sc.nextInt();
        displayBadge(credits);
        sc.close();
    }
}
