import java.util.GregorianCalendar;
import java.util.Calendar;

public class calenders{
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance(); 
        GregorianCalendar c = new GregorianCalendar(); 
        
        System.out.println("Calendar date : " +cal.getTime()); 
        System.out.println("Gregorian Calender : " +c.getTime());
    }
}