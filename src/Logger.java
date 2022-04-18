public class Logger {
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
}