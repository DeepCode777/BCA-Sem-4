public class type_casting
{
    public static void main(String[] args) {
    
        System.out.println("Implicit/Widening Type Casting");
        int x = 10;
        float y;
        y = x;
        System.out.println(y);
        
        System.out.println("Explicit/Narrowing Type Casting");
        int o;
        double p = 2.5;
        o = (int)p;
        System.out.println(o);
    }
}