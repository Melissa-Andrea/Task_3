package Factory;

import Product.*;

public class OrcFactory implements IFactory{
    @Override
    public IRace createRace() {
        return new OrcRace();
    }

    @Override
    public IHouse createHouse() {
        return new OrcHouse();
    }

    @Override
    public ICity createCity() {
        return new OrcCity();
    }
}
