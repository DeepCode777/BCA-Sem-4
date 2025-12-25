public class op_overload{
    void add(int a,int b,int c){
        System.out.println("Sum of three number is = "+ a + b + c);
    }
    void add(int a,int b){
        System.out.println("Sum of two number is = "+ a + b);
    }
}

public class compile_poly
{
    public static void main(String[] args) {
        op_overload o = new op_overload ();
        o.add(2,3,4);
        o.add(2,3);
    }
}