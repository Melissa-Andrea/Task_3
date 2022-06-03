package Factory;

import Product.*;

public class ElfFactory implements IFactory{
    @Override
    public IRace createRace() {
        return new ElfRace();
    }

    @Override
    public IHouse createHouse() {
        return new ElfHouse();
    }

    @Override
    public ICity createCity() {
        return new ElfCity();
    }
}
