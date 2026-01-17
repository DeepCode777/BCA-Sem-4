abstract class Bike{
    abstract void run();
    void display(){
        System.out.println("Hello");
    }
}
class honda extends Bike{
    void run(){
        System.out.println("Hi");
    }
}
class Abstract{
    public static void main(String[] args){
        honda h = new honda();
        h.run();
        h.display();
    }
}