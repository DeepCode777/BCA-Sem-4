public class ArithmeticExceptions
{
    public static void main(String[] args) {
        try{
            int a = 30,b = 0;
            int c = a/b;
            System.out.println("Result : " +c);
        }
        catch(ArithmeticException e){
            System.out.println("Cant Divide A Number By 0");
        }
    }
}