//Some Java file may not have a public class
//So the name doesn't have to match the file name

//But the class file generated from this file will not match the name
//It will based on the public class or the class name
class Greeting {
    public static void main(String argsp[]) {

        String[] arr2 = { "1", "2", "3" };
        arr2[1] = "new Tanaka";

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}