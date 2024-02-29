package package1;

import package2.*;

public class B {
    private String privateMessage = "This is a private message from B.java";

    public static void main(String[] args) {
        A aClass = new A();
        System.out.println(aClass.protectedMessage);
        B b = new B();
        System.out.println(b.privateMessage);
    }
}
