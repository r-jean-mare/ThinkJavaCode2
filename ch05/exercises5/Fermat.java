package exercises5;
import java.util.Scanner;
public class Fermat {
    public static boolean fermatLastTheorem(int a, int b, int c, int n){
        boolean fLTFalse;
        double fLT = Math.pow(a,n) + Math.pow(b,n) - Math.pow(c,n);
        if (fLT == 0){
            fLTFalse = true;
        } else {
            fLTFalse =false;
        }
    return fLTFalse;
    }

    public static void main(String[] args){
        int a , b, c, n;
        Scanner value = new Scanner(System.in);
        System.out.println("Pick 4 numbers. Hit space after each: ");
        a = value.nextInt();
        b = value.nextInt();
        c = value.nextInt();
        n = value.nextInt();

        if (n > 2 && fermatLastTheorem(a,b,c,n) ){
            System.out.print("Holy smokes, Fermat was wrong");
        } else {
            System.out.print("No that doesn't work");
        }
    }
}
