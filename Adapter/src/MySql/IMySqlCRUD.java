package MySql;

import Adapter.UserInformation;

public interface IMySqlCRUD {
    String create(UserInformation userInformation);
    String read();

}
