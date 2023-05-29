package exercises;

import java.util.Scanner;

/**
 * Converts celcius to Fahrenheit
 */
public class CtoF {
    public static void main(String[] args) {
        double celcius;
        double fahrenheit;
        final double RATIO = 1.8;
        final int SHIFT = 32;
        Scanner tempC = new Scanner(System.in);

        System.out.print("What is the temperature in Celcius: ");
        celcius = tempC.nextDouble();
        fahrenheit = (celcius*RATIO) + SHIFT;

        System.out.printf("%.1f C = %.1f F",celcius, fahrenheit);



    }
}
