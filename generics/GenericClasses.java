package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericClasses {
    public static void main(String[] args) {
        // Normal way
        myIntegerClass myInt = new myIntegerClass(4);
        System.out.println(myInt.getValue());

        // Generic Class
        MyGenericClass<String> myString = new MyGenericClass<>("Generic", "Share String");
        System.out.println(myString.getValue());
        System.out.println(myString.getString());

        // HashMap , using multiple generic parameter
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Boss", 100);
        studentAges.put("Boss1", 100);

        // Bounded type put some restriction on the generic parameter
        MyBoundedType<Double> myBound = new MyBoundedType<>(4.4);
        MyBoundedType<Integer> myBound2 = new MyBoundedType<>(4);
        MyBoundedType<Byte> myBound3 = new MyBoundedType<>((byte) 1);
        MyBoundedType<Long> myBound4 = new MyBoundedType<>(44000L);

    }

}

class myIntegerClass {
    Integer x;

    myIntegerClass(Integer x) {
        this.x = x;
    }

    public Integer getValue() {
        return x;
    }
}

class MyGenericClass<T> {
    T x;
    String shareString;

    MyGenericClass(T t, String string) {
        this.x = t;
        this.shareString = string;
    }

    public T getValue() {
        return x;
    }

    public String getString() {
        return this.shareString;
    }
}

class MyBoundedType<T extends Number> {
    T x;

    MyBoundedType(T x) {
        this.x = x;
    }

    public T getValue() {
        return this.x;
    }
}