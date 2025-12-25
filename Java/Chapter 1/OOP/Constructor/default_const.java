class A{
    int rno = 01;
    String name = "Deep";
    A(){
        System.out.println("Roll No. : "+ rno);
        System.out.println("Name. : "+ name);
    }
        
}
public class default_const
{
    public static void main(String[] args) {
        A d = new A();
    }
}