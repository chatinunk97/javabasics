import java.io.FileWriter;
import java.io.IOException;

public class W_FIleWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nI want to go to michuPiChu\n");
            writer.append("(Added line with append)");
            writer.close();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
        }
    }
}
