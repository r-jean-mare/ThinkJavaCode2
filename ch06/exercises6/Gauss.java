package exercises6;
import java.util.Scanner;

public class Gauss {
    public static double gauss(double x, int n){
        double sum = 0;
        double diff = - (x*x);
        double x0 = 1;
        for ( int i = 1 ; i <= n; i++){
            sum += x0;
            System.out.printf("%4d,%f",i,sum);
            System.out.println();

            x0 = x0 * diff/i;
            System.out.println(x0);
        } return sum;
    }
    public static void main(String[] args){
        Scanner gauss = new Scanner(System.in);
        System.out.print("Pick x and n: ");
        double x = gauss.nextDouble();
        int n = gauss.nextInt();
        System.out.println(gauss(x,n));

    }
}
