import java.util.Hashtable;
public class heshTable
{
    public static void main(String[] args) {
        Hashtable<String,Integer> table = new Hashtable<>();
        
        table.put("Apple",150);
        table.put("Grapes",100);
        table.put("Orange",50);
        // Key or value Pair Not Contain NULL any Part
        System.out.println(table);
    }
}