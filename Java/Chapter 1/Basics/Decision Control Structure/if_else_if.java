import java.util.Scanner;
public class if_else_if {
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        
        System.out.println("Enter Youre Mark");
        int marks = res.nextInt();
        
        if(marks >= 80)
            System.out.println("Topper");
        else if(marks >= 70 && marks < 80)
            System.out.println("First Class");
        else if(marks >= 60 && marks < 70)
            System.out.println("Second Class");
        else if(marks >= 40 && marks < 60)
            System.out.println("Distination");
        else
            System.out.println("Fail");
    }
}