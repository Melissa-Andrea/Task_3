package Factory;

public class CreatorXML implements ICreator{
    @Override
    public IDriver createDriver() {
        return new DriverXML();
    }
}
