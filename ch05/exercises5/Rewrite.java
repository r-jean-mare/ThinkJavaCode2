package exercises5;

import java.util.Scanner;

public class Rewrite {
    public static void ifPos(int a){
        if (a > 0 && a < 10) {
            System.out.println("Positive single digit number");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Is this a positive single digit number: ");
        int a = in.nextInt();
        ifPos(a);
    }
}
