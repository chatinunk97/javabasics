import java.io.File;

public class W_FileClass {
    public static void main(String[] args) {
        //Playing around with the file
        File file = new File("J_WhileLoopScanner.java");
        if (file.exists()) {
            System.out.println("That file exist !! : )");
            System.out.println("This is the normal path : " +file.getPath());
            System.out.println("This is the absolut (full) path"+file.getAbsolutePath());
            System.out.println(file.isFile());
        } else {
            System.out.println("That file does not exist :(");
        }
    }
}
