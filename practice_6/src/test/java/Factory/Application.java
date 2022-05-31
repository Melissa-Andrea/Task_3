package Factory;

public class Application {
    private ICreator creator;
    Logger logger = Logger.getInstance();


    public Application(ICreator creator) {
        this.creator = creator;
    }

    public String getUsers(String file){
        logger.msgDebug();
        IDriver fileDriver = this.creator.createDriver();
        return fileDriver.read(file);
    }

}
