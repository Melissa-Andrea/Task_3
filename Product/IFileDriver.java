package Product;

public interface IFileDriver {
    String read(String filename);
    String write(String filename, String content);

}
