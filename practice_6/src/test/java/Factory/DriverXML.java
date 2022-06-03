package Factory;

public class DriverXML implements IDriver{
    @Override
    public String read(String filename) {
        return filename + "Reading information XML file";
    }

    @Override
    public String write(String filename, String content) {
        return filename + "Writing information XML file";
    }
}
