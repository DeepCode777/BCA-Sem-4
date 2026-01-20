public class iib{
    int age;
    iib(){
        System.out.println(age);
    }
    {
        age = 10;
    }
}

public class example{
    public static void main(String[] args){
        iib r = new iib();
        iib d = new iib();
    }
}