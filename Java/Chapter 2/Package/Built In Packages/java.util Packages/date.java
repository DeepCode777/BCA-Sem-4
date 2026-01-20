import java.util.Date;

public class date{
    public static void main(String[] args){
        Date d = new Date();
        Date d1 = new Date(26-7-2005); 
        Date r = new Date(25-4-2005);
        
        System.out.println("Current date : " +d);
        System.out.println("Checking : " +d1.before(d)); 
        System.out.println("after : " +d1.after(r)); 
        System.out.println("Clone object : " +d.clone()); 
        System.out.println("Compare : " +d.compareTo(r)); 
        System.out.println("Equlas : " +d1.equals(r)); 
        System.out.println("Time : " +d.getTime()); 
        System.out.println("Hashcode : " +d.hashCode());
    }
}