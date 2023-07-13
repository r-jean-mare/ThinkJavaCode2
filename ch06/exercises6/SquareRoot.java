package exercises6;
import java.util.Scanner;

public class SquareRoot {
    public static double squareRoot(double a, double approx) {
        double b = (approx + a/approx)/2;
        return b;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = in.nextDouble();
        double approx = a/2;
        double b = squareRoot(a,approx);
        while (Math.abs(approx-b) > 0.0001){
            approx = b;
            b = squareRoot(a,approx);
        }
        System.out.println(b);
    }

}
