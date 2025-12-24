import java.util.Scanner;

public class Student {
    int rno;
    String name;
}

public class class_object
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s = new Student();
        s.rno = sc.nextInt();
        s.name = sc.next();
        
        System.out.println("Roll No."+ s.rno +" And Name "+ s.name);
    }
}