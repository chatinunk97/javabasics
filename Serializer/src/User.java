import java.io.Serializable;

public class User implements Serializable {
    String name;

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
