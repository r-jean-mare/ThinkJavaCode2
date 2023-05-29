package exercises;

import java.util.Random;
import java.util.Scanner;
/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        //create variable to hold guess & comparison
        int guess;
        //where the differences are Guess-Number and Number-Guess respectively
        int diffGuessNumb;
        int diffNumbGuess;
        int diff;
        // create Scanner & prompt user to guess
        Scanner readGuess = new Scanner(System.in);
        System.out.println("Thinking of number between 1 & 100 (inclusive). Can you guess it? ");
        System.out.print("Type a number: ");
        guess = readGuess.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The number i was thinking of was: " + number);
        diffGuessNumb = guess - number;
        diffNumbGuess = number - guess;
        diff = (((diffGuessNumb+1)/diffGuessNumb)*diffGuessNumb) + (((diffNumbGuess+1)/diffNumbGuess)*diffNumbGuess);
        System.out.println("You were off by: " + diff);


    }

}
