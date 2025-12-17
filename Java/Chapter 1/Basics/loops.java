public class loops
{
    public static void main(String[] args) {
        int i;
        System.out.println("For Loop");
        for(i = 1; i <= 5; i++){
            System.out.println(i);
        }
        
        int j = 1;
        System.out.println("While Loop");
        while(j <= 5){
            System.out.println(j);
            j++;
        }
        
        int k = 1;
        System.out.println("Do While Loop");
        do{
            System.out.println(k);
            k++;
        }while(k <= 5);
    }
}