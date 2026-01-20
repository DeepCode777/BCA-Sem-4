import java.util.StringTokenizer;

public class stringTokenizer{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("my name is Deep"); 
        System.out.println("Total number of Tokens :  " +st.countTokens()); 
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}