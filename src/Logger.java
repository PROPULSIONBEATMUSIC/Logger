import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    Thread thread = new Thread();
    String tag;

    public enum Type{
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    public Logger(String tag) {
        this.tag = tag;
    }

    public void auth() throws IOException {
        File file = new File("src/Logs/tag.log");
        Thread thread = new Thread();
        if (file.createNewFile()) {
            System.out.println("Created!");
        }
        FileWriter writer = new FileWriter(file);
        writer.write("DATA: " + LocalDateTime.now() + " ");
        writer.write("STREAM: " + thread.getName() + " ");
        writer.write("TYPE: " + (Logger.Type.INFO) + " ");
        writer.write("MESSAGE: " + "message");
        writer.close();

    }
}