import java.util.Random;

public class random{
    public static void main(String[] args){
        Random r = new Random(); 
        System.out.println("Integer val : " +r.nextInt()); 
        System.out.println("Next decimal : " +r.nextDouble());
    }
}