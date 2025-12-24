public class Test{
    private int age;
    public void set(int a){
        age = a;
    }
    public void get(){
        System.out.println(age);
    }
}

public class encapsulation
{
    public static void main(String[] args) {
         Test t = new Test();
         t.set(1);
         t.get();
    }
}