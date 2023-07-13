package exercises5;

import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {
    public static boolean guessesLeft(Scanner readGuess, int numOfGuesses, int number){
        boolean correct;
        if (numOfGuesses < 1){
            correct = false;

        } else {
            System.out.print("Type a number: ");
            int guess = readGuess.nextInt();
            numOfGuesses = numOfGuesses -1;
            if (guess == number){
                correct = true;
            } else {

                correct = false;
                if (guess < number){
                    System.out.println("Too Low");
                } else {
                    System.out.println("Too High");
                }
                System.out.printf("You have %d guesses left.\n", numOfGuesses);
                guessesLeft(readGuess, numOfGuesses,number);
            }
        }
    return correct;
    }


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        //create variable to hold guess
        int numOfGuesses = 3;
        // create Scanner & prompt user to guess
        Scanner readGuess = new Scanner(System.in);
        System.out.println("Thinking of number between 1 & 100 (inclusive). Can you guess it? ");
        boolean rightAnswer = guessesLeft(readGuess,numOfGuesses,number);
        if (!rightAnswer){
            System.out.printf("\nYou are out of guesses. \nThe number was: %d", number);
        } else {
            System.out.printf("Good guess. My number was: %d", number);
        }









    }

}
