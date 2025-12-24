public class Animal{
    Animal(){
        System.out.println("Eating");
    }
}
public class Dog extends Animal{
    Dog(){
        System.out.println("Barking");
    }
}

public class single_in
{
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}