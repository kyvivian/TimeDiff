public class TimeDiff {
    public static void main(String[] args) {
        int hour1 = 5;
        int min1 = 00;
        int hour2 = 13;
        int min2 = 25;
        int time = getTimeDiff(hour1, min1, hour2, min2);
        System.out.println("Expected: 505 but got " + time);
    }

    public static int getTimeDiff(int hour1, int min1, int hour2, int min2) {
        int totalHours = 0;
        int totalMinutes = 0;

        //Check hours
        if(hour2 < hour1) {
            int h1 = 24 - hour1;
            totalHours = h1 + hour2;
        }
        else {
            totalHours = hour2 - hour1;
        }
        
        //Check minutes
        if(min2 < min1) {
            totalHours--;
            int m1 = 60 - min1;
            totalMinutes = m1 + min2;
        }
        else {
            totalMinutes = min2 - min1;
        }

        totalMinutes += (totalHours * 60);

        return totalMinutes;


    }
}