public class Exceptions
{
    public static void main(String[] args) {
        try{
            int a = 5/0;
        }
        catch(Exception e){
            System.out.println("Arithmatic Exception");
        }
        finally{
            System.out.println("This Is From Finally Block");
        }
    }
}