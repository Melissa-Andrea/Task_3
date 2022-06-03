public class File implements INameProvider{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
