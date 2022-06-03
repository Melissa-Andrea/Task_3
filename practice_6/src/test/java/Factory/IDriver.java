package Factory;

public interface IDriver {
    String read(String filename);
    String write(String filename, String content);
}
