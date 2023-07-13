package exercises6;
import java.util.Scanner;
public class Doubloon {
    public static boolean doubloon(String c){
        c.toLowerCase();
        for(int i = 0; i < c.length(); i++){
            System.out.println(i);

            for(int j = 0; j < c.length(); i++){

                int counter = 0;
                while(j < c.length())
                if(j == c.indexOf(c.charAt(i)) || j == c.indexOf(c.substring(i+1).charAt(i))) {
                    counter += 1;
                    System.out.println(counter);
                }
                if (counter != 2){
                    System.out.println(counter);
                    return false;
                }
            }
        }
      return true;
    }

public static void main(String[] args){
        Scanner possible = new Scanner(System.in);
        System.out.print("Ye may have DOUBLOONS. Verily place them here: ");
        String c = possible.next();
        System.out.println(doubloon(c));


}
}