interface Parent{
    void display();
}
interface Child{
    void myprint();
}
class sam implements Parent,Child{
    public void display(){
        System.out.println("Hello");
    }
    public void myprint(){
        System.out.println("World");
    }
}
public class Interface{
    public static void main(String[] args) {
        sam s = new sam();
        s.display();
        s.myprint();
    }
}