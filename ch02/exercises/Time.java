package exercises;

public class Time {
    public static void main(String[] args) {
        int hour, minute, second;

        hour = 10;
        minute = 7;
        second = 42;

        int secondsElapsed = hour*3600 + minute*60 + second;
        int secondsleft = 24*3600 - secondsElapsed;
        double perCentDayPassed = secondsElapsed*(100.0/(24*3600));

        System.out.print("Number of seconds since midnight: ");
        System.out.println(secondsElapsed);
        System.out.print("Seconds left in day: ");
        System.out.println(secondsleft);
        System.out.println(perCentDayPassed);



    }
}
