package Deserializer.src;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User myDeserialUser;

        FileInputStream fileIn = new FileInputStream(
                "C:\\Users\\User\\Desktop\\Study\\1.2023DEVTIME\\3.JAVA\\javabasics\\Serializer\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        myDeserialUser = (User) in.readObject();

        System.out.println(myDeserialUser.name);
    }
}
