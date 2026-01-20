import java.lang.String;
public class string{
    public static void main(String[] args) {
        String s="hello"; 
        String s1="hello"; 
        String s3="karishma"; 
        String s4="rupani"; 
        String s5="hi";
        String s6="Hi"; 
        System.out.println("Charat : " +s.charAt(1)); 
        System.out.println("length.: " +s.length());
        System.out.println("substring : " +s.substring(1)); 
        System.out.println("substring : " +s.substring(1,3)); 
        System.out.println("index : " +s.contains("el")); 
        System.out.println("Equality : " +s.equals(s1)); 
        System.out.println("Empty : " +s.isEmpty()); 
        System.out.println("Concate : " +s3.concat(s4)); 
        System.out.println("replace : " +s.replace('l','k')); 
        System.out.println("Uppercase : " +s3.toUpperCase()); 
        System.out.println("Lowercase : " +s6.toLowerCase()); 
        System.out.println("IndexOf : " +s.indexOf('o')); 
        System.out.println("ignorecase : " +s5.equalsIgnoreCase(s6));
    }
}