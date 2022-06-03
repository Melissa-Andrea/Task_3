
import Factory.IFactory;
import Factory.ElfFactory;
import Factory.OrcFactory;

public class main {
    public static void main(String[] args) {
        IFactory factory = new ElfFactory();
        Application application = new Application(factory);

        application.populate();
        application.buildCity();
        application.generateHouse();

        IFactory factory1 = new OrcFactory();
        Application application1 = new Application(factory1);

        application1.populate();
        application1.buildCity();
        application1.generateHouse();




    }
}
