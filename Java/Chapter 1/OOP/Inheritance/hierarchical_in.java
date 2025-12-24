class Animal{
    Animal(){
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    Dog() {
        System.out.println("Barking");
    }
}
class Cat extends Animal{

    Cat(){
        System.out.println("Meowww");
    }
}
public class hierarchical.in {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
    }
}