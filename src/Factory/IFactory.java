package Factory;

import Product.ICity;
import Product.IHouse;
import Product.IRace;

public interface IFactory {
    IRace createRace();
    IHouse createHouse();
    ICity createCity();

}
