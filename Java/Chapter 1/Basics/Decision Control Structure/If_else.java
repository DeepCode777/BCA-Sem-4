import java.util.Scanner;
public class If_else
{
    public static void main(String[] args) {
        Scanner ag = new Scanner(System.in);
        
        System.out.println("Enter Your Age : ");
        int age = ag.nextInt();
        
        if(age > 18){
            System.out.println("Your age is (" +age+") Valid For Voting" );
        }else{
            System.out.println("Your age is (" +age+") Not Valid For Voting" );
        }
    }
}