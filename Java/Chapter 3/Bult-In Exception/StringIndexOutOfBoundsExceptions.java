public class StringIndexOutOfBoundsExceptions
{
    public static void main(String[] args) {
        try{
            String a = "This Is Like Me";
            char c = a.charAt(24);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Error");
        }
    }
}