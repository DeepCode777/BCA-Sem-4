import java.lang.StringBuffer;

public class stringBuffer{
    public static void main(String[] args){
        StringBuffer s=new StringBuffer("hello"); 
        
        System.out.println("Length : " +s.length()); 
        System.out.println("Specified : " +s.insert(2,"hi")); 
        System.out.println("Replace : " +s.replace(1,3,"ee")); 
        System.out.println("Deleting : " +s.delete(1,3)); 
        System.out.println("Reversing : " +s.reverse()); 
        System.out.println("Capacity : " +s.capacity()); 
        System.out.println("Charat : " +s.charAt(2)); 
        System.out.println("Substring : " +s.substring(1));
    }
}