import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new Logger("tag");
        Date date = new Date();
        Thread thread = new Thread();

        File file = new File("src/Logs/tag.log");
        if(file.createNewFile()){
            System.out.println("Created!");
        }

        FileWriter writer = new FileWriter(file);
        writer.write("DATA: " + date + "\n");
        writer.write("STREAM: " + thread.getName() + "\n");
        writer.write("TYPE: " + (Logger.Type.INFO) + "\n");
        writer.write("MESSAGE: " + "message");
        writer.close();

    }
}
