package exercises6;
import java.util.Scanner;
public class Abecedarian {
    public static boolean abecedarian(String candidate){
        char letter = candidate.charAt(0);
        for(int i = 1;i < candidate.length(); i++){
            if(letter >= candidate.charAt(i)){
                return false;
            } else {
                letter = candidate.charAt(i);}
            } return true;
        }
    public static void main(String[] args){
        Scanner potential = new Scanner(System.in);
        String candidate = potential.next();
        System.out.println(abecedarian(candidate));
    }
}

