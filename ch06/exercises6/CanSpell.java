package exercises6;

import java.util.Scanner;

public class CanSpell {
    public static String removeChar(String a, int b){
        String afterRemove = "";
        for (int i = 0; i < a.length(); i++){
            if(i != b){
                afterRemove += a.charAt(i);
            }
        }

return afterRemove;
    }
    public static boolean canSpell(String tiles, String word){
        boolean indicator = true;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = tiles.indexOf(letter);
            if (index != -1) {
                removeChar(tiles, index);
            } else {
                indicator = false;
            }
        }
            return indicator;
    }




    public static void main(String[] args) {
        System.out.println( canSpell(   "skjgfukhlsd","skj"));


    }
}
