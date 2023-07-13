package exercises4;

/**
 * Prints American and European dates using parametrised methods
 */
public class DateParam {
    public static void printAmerican(String day, int date, String month, int year){
        System.out.println("American format: " + day +", " + month +" "+ date + ", " + year);
    }
    public static void printEuropean(String day, int date, String month, int year){
        System.out.println("European format: " + day +" " + date +" "+ month + " " + year);

    }
    public static void main(String[] args) {
        String day;
        int date;
        String month;
        int year;

        day = "Weds";
        date = 24;
        month = "May";
        year = 2023;

        printAmerican(day, date, month, year );
        printEuropean(day, date, month,year);




    }
}
