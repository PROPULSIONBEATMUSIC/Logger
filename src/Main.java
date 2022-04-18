import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new Logger("tag");
        logger.auth();
        Logger logger2 = new Logger("tag");
        logger2.auth();
    }
}