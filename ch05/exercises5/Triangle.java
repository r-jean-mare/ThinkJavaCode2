package exercises5;

import java.util.Scanner;

public class Triangle {
    public static boolean checkGreaterZero(double a) {
        boolean greaterZero;
        if (a < 0) {
            greaterZero = false;
            System.out.printf("%f is less than 0", a);
        } else {
            greaterZero = true;
        }
        return greaterZero;
    }
    public static boolean triangleCheck(double a, double b, double c){
        boolean Poss;
        if ((checkGreaterZero(a)&&checkGreaterZero(b)&&checkGreaterZero(c))){
            if(a > b + c){
                Poss = false;
                System.out.printf("%f is too long\n", a);
            } else {
                Poss = true;
            }
        } else {Poss = false;
        }

        return Poss;}

    public static void Triangleposs(double a, double b, double c){
        boolean aCheck = checkGreaterZero(a);
        boolean bCheck = checkGreaterZero(b);
        boolean cCheck = checkGreaterZero(c);

        boolean aTricheck = triangleCheck(a,b,c);
        boolean bTricheck = triangleCheck(b,a,c);
        boolean cTricheck = triangleCheck(c,a,b);

      if ((aCheck && bCheck && cCheck) && aTricheck && bTricheck && cTricheck){
          System.out.println("A triangle is possible");
      } else {
          System.out.println("A triangle is not possible");
      }
    }
public static void main(String[] args){
        Scanner triSides = new Scanner(System.in);
        System.out.print("Let's see if we can make a triangle. Pick 3 numbers, separated by spaces");
        double a = triSides.nextInt();
        double b = triSides.nextInt();
        double c = triSides.nextInt();



        Triangleposs(a,b,c);
    }
}