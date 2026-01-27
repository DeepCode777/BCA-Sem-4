import java.util.Vector;
public class vector
{
    public static void main(String[] args) {
        Vector<Integer> r = new Vector<Integer>();
        r.add(10);
        r.add(20);
        r.add(30);
        r.addElement(40);
        
        System.out.println("Element Of Vector : " +r);
        System.out.println("Clone : " +r.clone());
        System.out.println("Capacity : " +r.capacity());
        System.out.println("Vector Size : " +r.size());
        System.out.println("First Element : " +r.firstElement());
        System.out.println("Last Element : " +r.lastElement());
        System.out.println("Index : " +r.indexOf(20));
        System.out.println("Contain : " +r.contains(10));
        r.remove(0);
        System.out.println("Element After Delete : " +r);
    }
}