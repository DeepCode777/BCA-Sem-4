class Outerclass{
    int x = 10;
    class Innerclass{
        int y = 5;
    }
}
public class nestedClass{
    public static void main(String[] args){
        Outerclass a = new Outerclass();
        Outerclass.Innerclass b = a.new Innerclass();
        System.out.println("Nested Vlass Outpu Is : " +(b.y + a.x));
    }
}