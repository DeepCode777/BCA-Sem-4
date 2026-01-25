import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleTryCatch
{
    public static void main(String[] args) {
        try{
            int a = 5/0;
        }
        catch(Exception e){
            System.out.println("Arithmatic Exception");
        }
        
        try{
            int a[] = {10,20,30,40,50};
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Not Found");
        }
        
        try{
            File file = new File("E:/Deep.txt");
            FileReader fr = new FileReader(file);
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        
        try{
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
        
        try{
            int num = Integer.parseInt("akki");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number Formate Error");
        }
        
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