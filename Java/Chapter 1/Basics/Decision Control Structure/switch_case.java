import java.util.Scanner;
public class switch_case
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A");
        int a = sc.nextInt();
        
        System.out.println("Enter B");
        int b = sc.nextInt();
        
        System.out.println("Press 1 For Addition, 2 For Sub, 3 For Mul, 4 For Div, 5 For Reminder Check");
        int ch = sc.nextInt();
        
        switch (ch){
            case 1 : System.out.println(a + b);
            break ;
            
            case 2 : System.out.println(a - b);
            break ;
            
            case 3 : System.out.println(a * b);
            break ;
            
            case 4 : System.out.println(a / b);
            break ;
            
            case 5 : System.out.println(a % b);
            break ;

            default : System.out.println("Enter Valid Number");
            break ;
        }
    }
}