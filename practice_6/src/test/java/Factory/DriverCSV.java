package Factory;

public class DriverCSV implements IDriver {

    @Override
    public String read(String filename) {
        return filename + "Reading information CSV file";
    }

    @Override
    public String write(String filename, String content) {
        return filename + "Writing information XML file";
    }
}
