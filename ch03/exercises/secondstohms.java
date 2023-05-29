package exercises;

import java.util.Scanner;

public class secondstohms {public static void main(String[] args) {
    int totalSeconds, hours, minutes, seconds;
    final int secsinmins = 60;
    final int secsinhours = 3600;
    Scanner timeConvert = new Scanner(System.in);

    System.out.print("How many seconds would you like to convert: ");

    totalSeconds = timeConvert.nextInt();
    seconds = totalSeconds;
    hours = seconds/(secsinhours);
    seconds = seconds % secsinhours;
    minutes = seconds/secsinmins;
    seconds =seconds % secsinmins;

    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds",totalSeconds, hours,minutes,seconds);
}
}
