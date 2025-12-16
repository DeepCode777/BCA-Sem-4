import java.util.Scanner ;
public class ConditionalOp
{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        System.out.println("Enter First Nume ");
        int a = op.nextInt();
        
        System.out.println("Enter First Nume ");
        int b = op.nextInt();
        
        int max = ( a >b ) ? a : b;
        System.out.println(max);
    }
}