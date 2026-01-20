import java.util.Random;

public class random{
    public static void main(String[] args){
        Random r=new Random(); 
        System.out.println("Doubles : " +r.doubles());
        System.out.println("Ints : " +r.ints());
        System.out.println("Longs : " +r.longs());
        System.out.println("Next Boolean : " +r.nextBoolean());
        System.out.println("Integer val : " +r.nextInt()); 
        System.out.println("Next decimal : " +r.nextDouble());
        System.out.println("Next Float : " +r.nextFloat());
        System.out.println("Next Long : " +r.nextLong());
    }
}