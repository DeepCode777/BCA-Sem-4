import java.util.Scanner;
public class IfLoop
{
    public static void main(String[] args) {
        Scanner ag = new Scanner(System.in);
        
        System.out.println("Enter Your Age : ");
        int age = ag.nextInt();
        
        if(age > 18){
            System.out.println("Your age is " +age+ " Valid For Voting" );
        }
    }
}