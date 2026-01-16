import java.util.Scanner;

class emp{
    Scanner sc = new Scanner(System.in);
    
    protected int id = sc.nextInt();
    protected String name = sc.next();
    protected String add = sc.next();
}

class dept extends emp{
    int did = sc.nextInt();
    String dnm = sc.next();
    dept (){
        System.out.println("Employee ID : " +id);
        System.out.println("Employee Name : " +name);
        System.out.println("Employee Address : " +add);
        
        System.out.println("Department ID : " +did);
        System.out.println("Depatrment Name : " +dnm);
    }
}

class access{
    public int data = 40; 
}

public class accessSpecifire
{
    public static void main(String[] args) {
        access r = new access();
        System.out.println("Data " +r.data);
        
        // dept d = new dept();   // <---<<   (Error)
    }
}