class Parent{
    Parent(){
        System.out.println("Parent Ckass");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Class");
    }
}
public class Inheritance_Const{
    public static void main(String[] args) {
        Child r = new Child();
    }
}