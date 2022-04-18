import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new Logger("tag");
        Logger authLogger = new Logger("Auth");
        logger.auth();
        authLogger.auth();
    }
}