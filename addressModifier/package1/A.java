package package1;

import package2.*;

public class A {

    protected String protectedMessage = "This is the protected Message from C.java";

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
