import Factory.IFactory;

public class Application {
    IFactory factory;

    public Application(IFactory factory) {
        this.factory = factory;
    }

    public void populate(){
        System.out.println("Create"+ factory.createRace());
    }

    public void generateHouse(){
        System.out.println("Create"+ factory.createHouse());
    }

    public void buildCity(){
        System.out.println("Create"+ factory.createCity());

    }
}
