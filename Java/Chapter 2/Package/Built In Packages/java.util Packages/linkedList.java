import java.util.LinkedList;
public class linkedList
{
    public static void main(String[] args) {
        LinkedList <String> r = new LinkedList <>();
        
        r.add("A");
        r.add("B");
        r.add("C");
        r.addLast("D");
        r.addFirst("E");
        System.out.println(r);
        
        r.remove("C");
        r.removeFirst();
        r.removeLast();
        System.out.println(r);
    }
}