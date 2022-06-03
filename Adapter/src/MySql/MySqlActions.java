package MySql;

import Adapter.UserInformation;

public class MySqlActions implements IMySqlCRUD {

    @Override
    public String create(UserInformation userInformation) {
        return "User Information MySql";
    }

    @Override
    public String read() {
        return null;
    }
}
