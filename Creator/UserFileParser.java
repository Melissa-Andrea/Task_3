package Creator;

import Product.IFileDriver;

public abstract class UserFileParser {
    public abstract IFileDriver createDriver();
    public abstract void getUser(String Filename);
}
