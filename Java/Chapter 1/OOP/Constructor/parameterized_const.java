class Geek{
    int id;
    String name;
    Geek(String nm, int i){
        name = nm;
        id = i;
    }
        
}
public class parameterized_const
{
    public static void main(String[] args) {
        Geek d = new Geek("Deep", 69);
        System.out.println("Name : " +d.name);
        System.out.println("ID : "+ d.id);
    }
}