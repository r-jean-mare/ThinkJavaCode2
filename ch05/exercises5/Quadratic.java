package exercises5;
import java.util.Scanner;
public class Quadratic {
    public static int discriminant(int a, int b, int c) {
        int discr = b * b - 4 * a * c;
        return discr;
    }

    public static boolean checks(int discr, int a) {
        boolean divby0 = false;
        boolean negDiscriminant = false;
        boolean flag = false;

        if (discr < 0) {
            negDiscriminant = true;
            System.err.println(
                    "The Discriminant for this choice of inputs is negative.");
        }
        if (a == 0) {
            divby0 = true;
            System.err.println("The Denominator for this choice of inputs is 0.");
        }
        if (divby0 || negDiscriminant) {
            flag = true;
        }
        return flag;
    }

    public static void quadFormula(int a, int b, int discr) {
        double xAdd, xSub;
        xAdd = (-b + Math.sqrt(discr)) / 2 * a;
        xSub = (-b - Math.sqrt(discr)) / 2 * a;
        if (xAdd == xSub) {
            System.out.printf("Just one answer this time: %f", xAdd);
        } else {
            System.out.printf(
                    "The two solutions are %f and %f , for addition and subtraction respectively",
                    xAdd, xSub);
        }

    }

    public static void main(String[] args) {
        Scanner coeffs = new Scanner(System.in);
        int a, b, c;
        System.out.println(
                "Give coefficients a,b,c separated by spaces, for a generic quadratic eqn: ");
        a = coeffs.nextInt();
        b = coeffs.nextInt();
        c = coeffs.nextInt();
        int discr = discriminant(a, b, c);



        if (checks(discr, a)){
        }
        else {
            quadFormula(a, b, discr);
        }

    }
}