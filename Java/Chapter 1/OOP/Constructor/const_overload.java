class overloading{
    int rno;
    String name;
    overloading (int r){
        rno = r;
    }
    overloading(int r, String nm){
        rno = r;
        name = nm;
    }
    void display(){
        System.out.println(rno);
        System.out.println(name);
    }
}
public class const_overload
{
    public static void main(String[] args) {
        overloading d = new overloading(10);
        overloading r = new overloading(69,"Deep");
        d.display();
        r.display();
    }
}