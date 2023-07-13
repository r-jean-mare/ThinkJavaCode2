package exercises6;

public class looptimeString {
    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12; //midnight
            }
        } else {
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d:%02d %s", hour, minute, ampm);

    }
    public static void main(String[] args){
        for (int i = 0; i < 24; i++ ) {
            String bigTimeString = "";
           for (int j = 0; j < 60; j++){
               bigTimeString += timeString(i,j) + " " ;

           } System.out.println(bigTimeString);
        }
    }
}
