import java.util.*;

public class SimpleInterestProblem {

    public static Double calculateSI(Double P, Double R, Double T) {
        Double SI = (P * R * T) / 100;
        return SI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double SI, PA, R, T;
        System.out.println("Enter Principal Amount, Rate and Time respectively: ");
        PA = sc.nextDouble();
        R = sc.nextDouble();
        T = sc.nextDouble();
        SI = calculateSI(PA, R, T);
        System.out.println("Calculated Simple Interest: " + SI);
        sc.close();
    }
}
