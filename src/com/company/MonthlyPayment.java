
import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P, Y, R;
        System.out.println("Enter the Year");
        Y = sc.nextDouble();
        System.out.println("Enter Principle");
        P = sc.nextDouble();
        System.out.println("Enter Rate");
        R = sc.nextDouble();
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow((1 + r) , (-n))) ;
        System.out.println("Monthly Payment is" + payment);
    }
}