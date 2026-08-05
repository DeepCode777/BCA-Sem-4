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
class My extends Dog{
    My(){
        System.out.println("My Dog");
    }
}
class My extends Cat{ // my1
    My(){ // my1
        System.out.println("My Cat");
    }
}
public class Single {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        My m = new My();
    }
}