import java.util.zip.ZipEntry;

public class L_StringClass {
    public static void main(String[] args) {
        // A string is a ref data type
        String name = "BroBRO";
        boolean result = name.equals("broBro");
        boolean result2 = name.equalsIgnoreCase("broBro");

        System.out.println(result + " ---- " + result2);
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("B"));
        System.out.println(name.toUpperCase());// toLowerCase()

        String newName = "           Z wow    ";
        System.out.println(newName.trim());
        System.out.println(newName.replace("Z", "NEWREPLACEMENT"));
    }
}
