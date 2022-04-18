import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    File file = new File("src/Logs/tag.log");
    FileWriter writer = new FileWriter(file);
    String tag;

    public enum Type{
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    public Logger(String tag) throws IOException {
        this.tag = tag;
    }

    public void auth() throws IOException {
        writer.write("DATA: " + LocalDateTime.now() + " STREAM: " + Thread.currentThread() + " TYPE: " + (Logger.Type.INFO) + " MESSAGE: " + "message");
        writer.close();
    }
}