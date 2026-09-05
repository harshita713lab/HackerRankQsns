package HackerRankSolutions;

import java.util.*;
import java.util.Calendar;
import java.util.Locale;

public class JavaDateAndTime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month  = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(Result.find(year, month, day));
        sc.close();
    }
}

class Result {
    public static String find(int year, int month, int day){
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}
