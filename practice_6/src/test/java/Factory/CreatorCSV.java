package Factory;

public class CreatorCSV implements ICreator{
    @Override
    public IDriver createDriver() {
        return new DriverCSV();
    }
}
