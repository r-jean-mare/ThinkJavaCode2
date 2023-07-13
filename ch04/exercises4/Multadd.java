package exercises4;

public class Multadd {
    public static double multadd(double a, double b, double c){
        return a * b + c;
    }
    public static double expSum(double x){
        double negE = Math.exp(-x);
        double root = Math.sqrt(1-negE);
        return multadd(x, negE, root);
    }

    public static void main(String[] args){
        double a = 1, b = 2 , c = 3;

        System.out.println(multadd(a, b, c));

        a = Math.cos(Math.PI/4);
        b = 1/2;
        c=Math.sin(Math.PI/4);

        System.out.println(multadd(a, b, c));

        a = 2;
        b = Math.log(10);
        c = Math.log(2);

        System.out.println(multadd(a, b, c));

        System.out.println(expSum(2.0));




    }

}
