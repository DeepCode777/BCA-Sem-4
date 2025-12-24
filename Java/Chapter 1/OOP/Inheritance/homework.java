import java.util.Scanner;

class Student {
    int rno;
    String name;

    static Scanner sc = new Scanner(System.in);

    Student() {
        rno = sc.nextInt();
        name = sc.next();
    }
}

class Test extends Student {
    int test1, test2;

    Test() {
        test1 = sc.nextInt();
        test2 = sc.nextInt();
    }
}

class Result extends Test {

    Result() {
        System.out.println(rno);
        System.out.println(name);
        System.out.println(test1);
        System.out.println(test2);
    }
}

public class multilevel_in{
    public static void main(String[] args) {
        Result d = new Result();
        Student.sc.close();
    }
}